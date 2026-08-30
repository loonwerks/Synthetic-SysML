// #Sireum
// @formatter:off

// This file is auto-generated from ContactClass.scala, EvidenceStatus.scala, ThreatBand.scala, ThreatValidity.scala, AlertState.scala, ThreatReport.scala, DefenseAuthority.scala, DefenseOutcome.scala, ChannelGate.scala, ChannelState.scala, EscapeAuthority.scala, EscapeOutcome.scala, RouteStatus.scala, MiningInterlock.scala, DefenseProposal.scala, EscapeProposal.scala, ResponsePattern.scala, DefenseDirective.scala, EscapeDirective.scala, ResponseStage.scala, DefenseChannelCondition.scala, EscapeChannelCondition.scala, ThreatEvidence.scala, QualifiedThreat.scala, DefenseReadinessContext.scala, ResponseFrame.scala, Base_Types.scala, ThreatQualification_threatResponseProcess_threatQualification_Containers.scala, AlertMemory_threatResponseProcess_alertMemory_Containers.scala, DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_Containers.scala, EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_Containers.scala, DefenseReadiness_threatResponseProcess_defenseReadiness_Containers.scala, DepartureReadiness_threatResponseProcess_departureReadiness_Containers.scala, DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_Containers.scala, DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Containers.scala, ResponseCoordination_threatResponseProcess_responseCoordination_Containers.scala, ReportFrameComposition_threatResponseProcess_reportFrameComposition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package frigate_threat_response_coordinator

import org.sireum._

object MsgPack {

  object Constants {

    val Frigate_Threat_Response_CoordinatorContactClass_Payload: Z = -32

    val Frigate_Threat_Response_CoordinatorEvidenceStatus_Payload: Z = -31

    val Frigate_Threat_Response_CoordinatorThreatBand_Payload: Z = -30

    val Frigate_Threat_Response_CoordinatorThreatValidity_Payload: Z = -29

    val Frigate_Threat_Response_CoordinatorAlertState_Payload: Z = -28

    val Frigate_Threat_Response_CoordinatorThreatReport_Payload: Z = -27

    val Frigate_Threat_Response_CoordinatorDefenseAuthority_Payload: Z = -26

    val Frigate_Threat_Response_CoordinatorDefenseOutcome_Payload: Z = -25

    val Frigate_Threat_Response_CoordinatorChannelGate_Payload: Z = -24

    val Frigate_Threat_Response_CoordinatorChannelState_Payload: Z = -23

    val Frigate_Threat_Response_CoordinatorEscapeAuthority_Payload: Z = -22

    val Frigate_Threat_Response_CoordinatorEscapeOutcome_Payload: Z = -21

    val Frigate_Threat_Response_CoordinatorRouteStatus_Payload: Z = -20

    val Frigate_Threat_Response_CoordinatorMiningInterlock_Payload: Z = -19

    val Frigate_Threat_Response_CoordinatorDefenseProposal_Payload: Z = -18

    val Frigate_Threat_Response_CoordinatorEscapeProposal_Payload: Z = -17

    val Frigate_Threat_Response_CoordinatorResponsePattern_Payload: Z = -16

    val Frigate_Threat_Response_CoordinatorDefenseDirective_Payload: Z = -15

    val Frigate_Threat_Response_CoordinatorEscapeDirective_Payload: Z = -14

    val Frigate_Threat_Response_CoordinatorResponseStage_Payload: Z = -13

    val Frigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload: Z = -12

    val Frigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload: Z = -11

    val Frigate_Threat_Response_CoordinatorThreatEvidence: Z = -10

    val Frigate_Threat_Response_CoordinatorThreatEvidence_Payload: Z = -9

    val Frigate_Threat_Response_CoordinatorQualifiedThreat: Z = -8

    val Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload: Z = -7

    val Frigate_Threat_Response_CoordinatorDefenseReadinessContext: Z = -6

    val Frigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload: Z = -5

    val Frigate_Threat_Response_CoordinatorResponseFrame: Z = -4

    val Frigate_Threat_Response_CoordinatorResponseFrame_Payload: Z = -3

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

    val Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P: Z = 14

    val Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS: Z = 15

    val Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P: Z = 16

    val Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS: Z = 17

    val Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P: Z = 18

    val Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS: Z = 19

    val Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P: Z = 20

    val Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS: Z = 21

    val Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P: Z = 22

    val Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS: Z = 23

    val Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P: Z = 24

    val Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS: Z = 25

    val Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P: Z = 26

    val Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS: Z = 27

    val Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P: Z = 28

    val Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS: Z = 29

    val Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P: Z = 30

    val Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS: Z = 31

    val Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P: Z = 32

    val Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS: Z = 33

    val Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P: Z = 34

    val Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS: Z = 35

    val Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P: Z = 36

    val Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS: Z = 37

    val Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P: Z = 38

    val Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS: Z = 39

    val Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P: Z = 40

    val Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS: Z = 41

    val Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P: Z = 42

    val Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS: Z = 43

    val Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P: Z = 44

    val Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS: Z = 45

    val Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P: Z = 46

    val Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS: Z = 47

    val Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P: Z = 48

    val Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS: Z = 49

    val Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P: Z = 50

    val Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS: Z = 51

    val Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P: Z = 52

    val Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS: Z = 53

    val utilEmptyContainer: Z = 54

    val _artEmpty: Z = 55

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFrigate_Threat_Response_CoordinatorContactClassType(o: Frigate_Threat_Response_Coordinator.ContactClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorContactClass_Payload(o: Frigate_Threat_Response_Coordinator.ContactClass_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorContactClass_Payload)
      writeFrigate_Threat_Response_CoordinatorContactClassType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorEvidenceStatusType(o: Frigate_Threat_Response_Coordinator.EvidenceStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEvidenceStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorEvidenceStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatBandType(o: Frigate_Threat_Response_Coordinator.ThreatBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatBand_Payload(o: Frigate_Threat_Response_Coordinator.ThreatBand_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatBand_Payload)
      writeFrigate_Threat_Response_CoordinatorThreatBandType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatValidityType(o: Frigate_Threat_Response_Coordinator.ThreatValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatValidity_Payload)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorAlertStateType(o: Frigate_Threat_Response_Coordinator.AlertState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorAlertState_Payload(o: Frigate_Threat_Response_Coordinator.AlertState_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorAlertState_Payload)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReportType(o: Frigate_Threat_Response_Coordinator.ThreatReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReport_Payload(o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatReport_Payload)
      writeFrigate_Threat_Response_CoordinatorThreatReportType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o: Frigate_Threat_Response_Coordinator.DefenseAuthority.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseAuthority_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o: Frigate_Threat_Response_Coordinator.DefenseOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseOutcome_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorChannelGateType(o: Frigate_Threat_Response_Coordinator.ChannelGate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorChannelGate_Payload(o: Frigate_Threat_Response_Coordinator.ChannelGate_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorChannelGate_Payload)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorChannelStateType(o: Frigate_Threat_Response_Coordinator.ChannelState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorChannelState_Payload(o: Frigate_Threat_Response_Coordinator.ChannelState_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorChannelState_Payload)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o: Frigate_Threat_Response_Coordinator.EscapeAuthority.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeAuthority_Payload)
      writeFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o: Frigate_Threat_Response_Coordinator.EscapeOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeOutcome_Payload)
      writeFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorRouteStatusType(o: Frigate_Threat_Response_Coordinator.RouteStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o: Frigate_Threat_Response_Coordinator.RouteStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRouteStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorRouteStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorMiningInterlockType(o: Frigate_Threat_Response_Coordinator.MiningInterlock.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorMiningInterlock_Payload)
      writeFrigate_Threat_Response_CoordinatorMiningInterlockType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o: Frigate_Threat_Response_Coordinator.DefenseProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseProposal_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o: Frigate_Threat_Response_Coordinator.EscapeProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeProposal_Payload)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponsePatternType(o: Frigate_Threat_Response_Coordinator.ResponsePattern.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponsePattern_Payload)
      writeFrigate_Threat_Response_CoordinatorResponsePatternType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseDirectiveType(o: Frigate_Threat_Response_Coordinator.DefenseDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseDirective_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseDirectiveType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeDirectiveType(o: Frigate_Threat_Response_Coordinator.EscapeDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeDirective_Payload)
      writeFrigate_Threat_Response_CoordinatorEscapeDirectiveType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseStageType(o: Frigate_Threat_Response_Coordinator.ResponseStage.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseStage_Payload(o: Frigate_Threat_Response_Coordinator.ResponseStage_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseStage_Payload)
      writeFrigate_Threat_Response_CoordinatorResponseStageType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload)
      writeFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatEvidence(o: Frigate_Threat_Response_Coordinator.ThreatEvidence): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidence)
      writeFrigate_Threat_Response_CoordinatorContactClassType(o.contactClass)
      writeFrigate_Threat_Response_CoordinatorEvidenceStatusType(o.evidenceStatus)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidence_Payload)
      writeFrigate_Threat_Response_CoordinatorThreatEvidence(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorQualifiedThreat(o: Frigate_Threat_Response_Coordinator.QualifiedThreat): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat)
      writeFrigate_Threat_Response_CoordinatorThreatBandType(o.band)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.validity)
    }

    def writeFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreat(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessContext)
      writer.writeB(o.defenseAvailable)
      writer.writeB(o.capacitorAdequate)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseFrame(o: Frigate_Threat_Response_Coordinator.ResponseFrame): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseFrame)
      writeFrigate_Threat_Response_CoordinatorThreatReportType(o.threatReport)
      writeFrigate_Threat_Response_CoordinatorDefenseDirectiveType(o.defenseDirective)
      writeFrigate_Threat_Response_CoordinatorEscapeDirectiveType(o.escapeDirective)
      writeFrigate_Threat_Response_CoordinatorResponsePatternType(o.responsePattern)
      writeFrigate_Threat_Response_CoordinatorResponseStageType(o.responseStage)
      writeFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(o.defenseCondition)
      writeFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(o.escapeCondition)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseFrame_Payload)
      writeFrigate_Threat_Response_CoordinatorResponseFrame(o.value)
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

    def writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorThreatEvidence(o.api_threatEvidenceIn)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorThreatEvidence(o.api_threatEvidenceIn)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatToAlertOut)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToDefenseOut)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToEscapeOut)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatToAlertOut)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToDefenseOut)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToEscapeOut)
    }

    def writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P)
      writer.writeB(o.api_clearAcknowledgmentIn)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatIn)
    }

    def writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS)
      writer.writeB(o.api_clearAcknowledgmentIn)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatIn)
    }

    def writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_compositionAlertOut)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_defenseAlertOut)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_escapeAlertOut)
      writeFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportOut)
    }

    def writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_compositionAlertOut)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_defenseAlertOut)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_escapeAlertOut)
      writeFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)
      writeFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o.api_defenseOutcomeIn)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)
      writeFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o.api_defenseOutcomeIn)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateOut)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateOut)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateOut)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)
      writeFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o.api_escapeOutcomeIn)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)
      writeFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o.api_escapeOutcomeIn)
      writeFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateOut)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateOut)
    }

    def writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateOut)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateIn)
      writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o.api_readinessContextIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateIn)
      writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o.api_readinessContextIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P)
      writer.writeB(o.api_defenseReadyOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS)
      writer.writeB(o.api_defenseReadyOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateIn)
      writeFrigate_Threat_Response_CoordinatorMiningInterlockType(o.api_miningInterlockIn)
      writer.writeB(o.api_navigationAvailableIn)
      writeFrigate_Threat_Response_CoordinatorRouteStatusType(o.api_routeStatusIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateIn)
      writeFrigate_Threat_Response_CoordinatorMiningInterlockType(o.api_miningInterlockIn)
      writer.writeB(o.api_navigationAvailableIn)
      writeFrigate_Threat_Response_CoordinatorRouteStatusType(o.api_routeStatusIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P)
      writer.writeB(o.api_escapeReadyOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS)
      writer.writeB(o.api_escapeReadyOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)
      writeFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)
      writer.writeB(o.api_defenseReadyIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)
      writeFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)
      writer.writeB(o.api_defenseReadyIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCompositionOut)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCoordinationOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCompositionOut)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCoordinationOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)
      writeFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)
      writer.writeB(o.api_escapeReadyIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)
      writeFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)
      writer.writeB(o.api_escapeReadyIn)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCompositionOut)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCoordinationOut)
    }

    def writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCompositionOut)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCoordinationOut)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternOut)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternOut)
    }

    def writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateIn)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateIn)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn)
      writeFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternIn)
      writeFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportIn)
    }

    def writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateIn)
      writeFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)
      writeFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateIn)
      writeFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn)
      writeFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternIn)
      writeFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportIn)
    }

    def writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorResponseFrame(o.api_responseFrameOut)
    }

    def writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorResponseFrame(o.api_responseFrameOut)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
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
        case o: Frigate_Threat_Response_Coordinator.AlertState_Payload => writeFrigate_Threat_Response_CoordinatorAlertState_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatBand_Payload => writeFrigate_Threat_Response_CoordinatorThreatBand_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ChannelGate_Payload => writeFrigate_Threat_Response_CoordinatorChannelGate_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RouteStatus_Payload => writeFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ChannelState_Payload => writeFrigate_Threat_Response_CoordinatorChannelState_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload => writeFrigate_Threat_Response_CoordinatorThreatReport_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactClass_Payload => writeFrigate_Threat_Response_CoordinatorContactClass_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload => writeFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseStage_Payload => writeFrigate_Threat_Response_CoordinatorResponseStage_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload => writeFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload => writeFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload => writeFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload => writeFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload => writeFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload => writeFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload => writeFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload => writeFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload => writeFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload => writeFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload => writeFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload => writeFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload => writeFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload => writeFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload => writeFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload => writeFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload => writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
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

    def readFrigate_Threat_Response_CoordinatorContactClassType(): Frigate_Threat_Response_Coordinator.ContactClass.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ContactClass.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorContactClass_Payload(): Frigate_Threat_Response_Coordinator.ContactClass_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorContactClass_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorContactClass_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorContactClass_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorContactClassType()
      return Frigate_Threat_Response_Coordinator.ContactClass_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorEvidenceStatusType(): Frigate_Threat_Response_Coordinator.EvidenceStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.EvidenceStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(): Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorEvidenceStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEvidenceStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEvidenceStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorEvidenceStatusType()
      return Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorThreatBandType(): Frigate_Threat_Response_Coordinator.ThreatBand.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ThreatBand.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorThreatBand_Payload(): Frigate_Threat_Response_Coordinator.ThreatBand_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorThreatBand_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatBand_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatBand_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorThreatBandType()
      return Frigate_Threat_Response_Coordinator.ThreatBand_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorThreatValidityType(): Frigate_Threat_Response_Coordinator.ThreatValidity.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ThreatValidity.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorThreatValidity_Payload(): Frigate_Threat_Response_Coordinator.ThreatValidity_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorThreatValidity_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatValidity_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatValidity_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.ThreatValidity_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorAlertStateType(): Frigate_Threat_Response_Coordinator.AlertState.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.AlertState.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorAlertState_Payload(): Frigate_Threat_Response_Coordinator.AlertState_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorAlertState_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorAlertState_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorAlertState_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorAlertStateType()
      return Frigate_Threat_Response_Coordinator.AlertState_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportType(): Frigate_Threat_Response_Coordinator.ThreatReport.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ThreatReport.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorThreatReport_Payload(): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatReport_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorThreatReportType()
      return Frigate_Threat_Response_Coordinator.ThreatReport_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAuthorityType(): Frigate_Threat_Response_Coordinator.DefenseAuthority.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseAuthority.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(): Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseAuthority_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAuthority_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseAuthority_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      return Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseOutcomeType(): Frigate_Threat_Response_Coordinator.DefenseOutcome.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseOutcome.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(): Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseOutcome_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseOutcome_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseOutcome_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseOutcomeType()
      return Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorChannelGateType(): Frigate_Threat_Response_Coordinator.ChannelGate.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ChannelGate.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorChannelGate_Payload(): Frigate_Threat_Response_Coordinator.ChannelGate_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorChannelGate_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorChannelGate_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ChannelGate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorChannelGate_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorChannelGateType()
      return Frigate_Threat_Response_Coordinator.ChannelGate_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorChannelStateType(): Frigate_Threat_Response_Coordinator.ChannelState.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ChannelState.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorChannelState_Payload(): Frigate_Threat_Response_Coordinator.ChannelState_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorChannelState_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorChannelState_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ChannelState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorChannelState_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorChannelStateType()
      return Frigate_Threat_Response_Coordinator.ChannelState_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeAuthorityType(): Frigate_Threat_Response_Coordinator.EscapeAuthority.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.EscapeAuthority.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(): Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeAuthority_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeAuthority_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeAuthority_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      return Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeOutcomeType(): Frigate_Threat_Response_Coordinator.EscapeOutcome.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.EscapeOutcome.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(): Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeOutcome_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeOutcome_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeOutcome_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorEscapeOutcomeType()
      return Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorRouteStatusType(): Frigate_Threat_Response_Coordinator.RouteStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.RouteStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorRouteStatus_Payload(): Frigate_Threat_Response_Coordinator.RouteStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorRouteStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRouteStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RouteStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRouteStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorRouteStatusType()
      return Frigate_Threat_Response_Coordinator.RouteStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorMiningInterlockType(): Frigate_Threat_Response_Coordinator.MiningInterlock.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.MiningInterlock.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(): Frigate_Threat_Response_Coordinator.MiningInterlock_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorMiningInterlock_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorMiningInterlock_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.MiningInterlock_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorMiningInterlock_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorMiningInterlockType()
      return Frigate_Threat_Response_Coordinator.MiningInterlock_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseProposalType(): Frigate_Threat_Response_Coordinator.DefenseProposal.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseProposal.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(): Frigate_Threat_Response_Coordinator.DefenseProposal_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseProposal_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseProposal_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseProposal_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      return Frigate_Threat_Response_Coordinator.DefenseProposal_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeProposalType(): Frigate_Threat_Response_Coordinator.EscapeProposal.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.EscapeProposal.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(): Frigate_Threat_Response_Coordinator.EscapeProposal_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeProposal_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeProposal_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeProposal_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      return Frigate_Threat_Response_Coordinator.EscapeProposal_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponsePatternType(): Frigate_Threat_Response_Coordinator.ResponsePattern.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ResponsePattern.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorResponsePattern_Payload(): Frigate_Threat_Response_Coordinator.ResponsePattern_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponsePattern_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponsePattern_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponsePattern_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponsePattern_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponsePatternType()
      return Frigate_Threat_Response_Coordinator.ResponsePattern_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseDirectiveType(): Frigate_Threat_Response_Coordinator.DefenseDirective.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseDirective.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(): Frigate_Threat_Response_Coordinator.DefenseDirective_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseDirective_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseDirective_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseDirective_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseDirectiveType()
      return Frigate_Threat_Response_Coordinator.DefenseDirective_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeDirectiveType(): Frigate_Threat_Response_Coordinator.EscapeDirective.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.EscapeDirective.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(): Frigate_Threat_Response_Coordinator.EscapeDirective_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeDirective_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeDirective_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeDirective_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorEscapeDirectiveType()
      return Frigate_Threat_Response_Coordinator.EscapeDirective_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponseStageType(): Frigate_Threat_Response_Coordinator.ResponseStage.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ResponseStage.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorResponseStage_Payload(): Frigate_Threat_Response_Coordinator.ResponseStage_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponseStage_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseStage_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseStage_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseStage_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponseStageType()
      return Frigate_Threat_Response_Coordinator.ResponseStage_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(): Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseChannelCondition.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(): Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseChannelCondition_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseChannelConditionType()
      return Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(): Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.EscapeChannelCondition.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(): Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeChannelCondition_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorEscapeChannelConditionType()
      return Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidence(): Frigate_Threat_Response_Coordinator.ThreatEvidence = {
      val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidence)
      }
      val contactClass = readFrigate_Threat_Response_CoordinatorContactClassType()
      val evidenceStatus = readFrigate_Threat_Response_CoordinatorEvidenceStatusType()
      return Frigate_Threat_Response_Coordinator.ThreatEvidence(contactClass, evidenceStatus)
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(): Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorThreatEvidence_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidence_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorThreatEvidence()
      return Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorQualifiedThreat(): Frigate_Threat_Response_Coordinator.QualifiedThreat = {
      val r = readFrigate_Threat_Response_CoordinatorQualifiedThreatT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorQualifiedThreatT(typeParsed: B): Frigate_Threat_Response_Coordinator.QualifiedThreat = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat)
      }
      val band = readFrigate_Threat_Response_CoordinatorThreatBandType()
      val validity = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.QualifiedThreat(band, validity)
    }

    def readFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorQualifiedThreat()
      return Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessContext(): Frigate_Threat_Response_Coordinator.DefenseReadinessContext = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessContextT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessContextT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessContext = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessContext)
      }
      val defenseAvailable = reader.readB()
      val capacitorAdequate = reader.readB()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessContext(defenseAvailable, capacitorAdequate)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(): Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessContext_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessContext_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponseFrame(): Frigate_Threat_Response_Coordinator.ResponseFrame = {
      val r = readFrigate_Threat_Response_CoordinatorResponseFrameT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseFrameT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseFrame)
      }
      val threatReport = readFrigate_Threat_Response_CoordinatorThreatReportType()
      val defenseDirective = readFrigate_Threat_Response_CoordinatorDefenseDirectiveType()
      val escapeDirective = readFrigate_Threat_Response_CoordinatorEscapeDirectiveType()
      val responsePattern = readFrigate_Threat_Response_CoordinatorResponsePatternType()
      val responseStage = readFrigate_Threat_Response_CoordinatorResponseStageType()
      val defenseCondition = readFrigate_Threat_Response_CoordinatorDefenseChannelConditionType()
      val escapeCondition = readFrigate_Threat_Response_CoordinatorEscapeChannelConditionType()
      return Frigate_Threat_Response_Coordinator.ResponseFrame(threatReport, defenseDirective, escapeDirective, responsePattern, responseStage, defenseCondition, escapeCondition)
    }

    def readFrigate_Threat_Response_CoordinatorResponseFrame_Payload(): Frigate_Threat_Response_Coordinator.ResponseFrame_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponseFrame_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseFrame_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseFrame_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponseFrame()
      return Frigate_Threat_Response_Coordinator.ResponseFrame_Payload(value)
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

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P)
      }
      val api_threatEvidenceIn = readFrigate_Threat_Response_CoordinatorThreatEvidence()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(api_threatEvidenceIn)
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS)
      }
      val api_threatEvidenceIn = readFrigate_Threat_Response_CoordinatorThreatEvidence()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(api_threatEvidenceIn)
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P)
      }
      val api_qualifiedThreatToAlertOut = readFrigate_Threat_Response_CoordinatorQualifiedThreat()
      val api_threatValidityToDefenseOut = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      val api_threatValidityToEscapeOut = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(api_qualifiedThreatToAlertOut, api_threatValidityToDefenseOut, api_threatValidityToEscapeOut)
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS)
      }
      val api_qualifiedThreatToAlertOut = readFrigate_Threat_Response_CoordinatorQualifiedThreat()
      val api_threatValidityToDefenseOut = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      val api_threatValidityToEscapeOut = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(api_qualifiedThreatToAlertOut, api_threatValidityToDefenseOut, api_threatValidityToEscapeOut)
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P)
      }
      val api_clearAcknowledgmentIn = reader.readB()
      val api_qualifiedThreatIn = readFrigate_Threat_Response_CoordinatorQualifiedThreat()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(api_clearAcknowledgmentIn, api_qualifiedThreatIn)
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS)
      }
      val api_clearAcknowledgmentIn = reader.readB()
      val api_qualifiedThreatIn = readFrigate_Threat_Response_CoordinatorQualifiedThreat()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(api_clearAcknowledgmentIn, api_qualifiedThreatIn)
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P)
      }
      val api_compositionAlertOut = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_defenseAlertOut = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_escapeAlertOut = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_threatReportOut = readFrigate_Threat_Response_CoordinatorThreatReportType()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(api_compositionAlertOut, api_defenseAlertOut, api_escapeAlertOut, api_threatReportOut)
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS)
      }
      val api_compositionAlertOut = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_defenseAlertOut = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_escapeAlertOut = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_threatReportOut = readFrigate_Threat_Response_CoordinatorThreatReportType()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(api_compositionAlertOut, api_defenseAlertOut, api_escapeAlertOut, api_threatReportOut)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P)
      }
      val api_defenseAuthorityIn = readFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      val api_defenseOutcomeIn = readFrigate_Threat_Response_CoordinatorDefenseOutcomeType()
      val api_threatValidityIn = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(api_defenseAuthorityIn, api_defenseOutcomeIn, api_threatValidityIn)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS)
      }
      val api_defenseAuthorityIn = readFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      val api_defenseOutcomeIn = readFrigate_Threat_Response_CoordinatorDefenseOutcomeType()
      val api_threatValidityIn = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(api_defenseAuthorityIn, api_defenseOutcomeIn, api_threatValidityIn)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P)
      }
      val api_defenseChannelStateOut = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_defenseGateOut = readFrigate_Threat_Response_CoordinatorChannelGateType()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(api_defenseChannelStateOut, api_defenseGateOut)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS)
      }
      val api_defenseChannelStateOut = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_defenseGateOut = readFrigate_Threat_Response_CoordinatorChannelGateType()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(api_defenseChannelStateOut, api_defenseGateOut)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P)
      }
      val api_escapeAuthorityIn = readFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      val api_escapeOutcomeIn = readFrigate_Threat_Response_CoordinatorEscapeOutcomeType()
      val api_threatValidityIn = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(api_escapeAuthorityIn, api_escapeOutcomeIn, api_threatValidityIn)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS)
      }
      val api_escapeAuthorityIn = readFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      val api_escapeOutcomeIn = readFrigate_Threat_Response_CoordinatorEscapeOutcomeType()
      val api_threatValidityIn = readFrigate_Threat_Response_CoordinatorThreatValidityType()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(api_escapeAuthorityIn, api_escapeOutcomeIn, api_threatValidityIn)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P)
      }
      val api_escapeChannelStateOut = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_escapeGateOut = readFrigate_Threat_Response_CoordinatorChannelGateType()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(api_escapeChannelStateOut, api_escapeGateOut)
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS)
      }
      val api_escapeChannelStateOut = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_escapeGateOut = readFrigate_Threat_Response_CoordinatorChannelGateType()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(api_escapeChannelStateOut, api_escapeGateOut)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P)
      }
      val api_defenseGateIn = readFrigate_Threat_Response_CoordinatorChannelGateType()
      val api_readinessContextIn = readFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(api_defenseGateIn, api_readinessContextIn)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS)
      }
      val api_defenseGateIn = readFrigate_Threat_Response_CoordinatorChannelGateType()
      val api_readinessContextIn = readFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(api_defenseGateIn, api_readinessContextIn)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P)
      }
      val api_defenseReadyOut = reader.readB()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(api_defenseReadyOut)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS)
      }
      val api_defenseReadyOut = reader.readB()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(api_defenseReadyOut)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P)
      }
      val api_escapeGateIn = readFrigate_Threat_Response_CoordinatorChannelGateType()
      val api_miningInterlockIn = readFrigate_Threat_Response_CoordinatorMiningInterlockType()
      val api_navigationAvailableIn = reader.readB()
      val api_routeStatusIn = readFrigate_Threat_Response_CoordinatorRouteStatusType()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(api_escapeGateIn, api_miningInterlockIn, api_navigationAvailableIn, api_routeStatusIn)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS)
      }
      val api_escapeGateIn = readFrigate_Threat_Response_CoordinatorChannelGateType()
      val api_miningInterlockIn = readFrigate_Threat_Response_CoordinatorMiningInterlockType()
      val api_navigationAvailableIn = reader.readB()
      val api_routeStatusIn = readFrigate_Threat_Response_CoordinatorRouteStatusType()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(api_escapeGateIn, api_miningInterlockIn, api_navigationAvailableIn, api_routeStatusIn)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P)
      }
      val api_escapeReadyOut = reader.readB()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(api_escapeReadyOut)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS)
      }
      val api_escapeReadyOut = reader.readB()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(api_escapeReadyOut)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P)
      }
      val api_alertStateIn = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_defenseAuthorityIn = readFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      val api_defenseReadyIn = reader.readB()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(api_alertStateIn, api_defenseAuthorityIn, api_defenseReadyIn)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS)
      }
      val api_alertStateIn = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_defenseAuthorityIn = readFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      val api_defenseReadyIn = reader.readB()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(api_alertStateIn, api_defenseAuthorityIn, api_defenseReadyIn)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P)
      }
      val api_defenseProposalToCompositionOut = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      val api_defenseProposalToCoordinationOut = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(api_defenseProposalToCompositionOut, api_defenseProposalToCoordinationOut)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS)
      }
      val api_defenseProposalToCompositionOut = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      val api_defenseProposalToCoordinationOut = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(api_defenseProposalToCompositionOut, api_defenseProposalToCoordinationOut)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P)
      }
      val api_alertStateIn = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_escapeAuthorityIn = readFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      val api_escapeReadyIn = reader.readB()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(api_alertStateIn, api_escapeAuthorityIn, api_escapeReadyIn)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS)
      }
      val api_alertStateIn = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_escapeAuthorityIn = readFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      val api_escapeReadyIn = reader.readB()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(api_alertStateIn, api_escapeAuthorityIn, api_escapeReadyIn)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P)
      }
      val api_escapeProposalToCompositionOut = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      val api_escapeProposalToCoordinationOut = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(api_escapeProposalToCompositionOut, api_escapeProposalToCoordinationOut)
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS)
      }
      val api_escapeProposalToCompositionOut = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      val api_escapeProposalToCoordinationOut = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(api_escapeProposalToCompositionOut, api_escapeProposalToCoordinationOut)
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P)
      }
      val api_defenseProposalIn = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      val api_escapeProposalIn = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(api_defenseProposalIn, api_escapeProposalIn)
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS)
      }
      val api_defenseProposalIn = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      val api_escapeProposalIn = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(api_defenseProposalIn, api_escapeProposalIn)
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P)
      }
      val api_responsePatternOut = readFrigate_Threat_Response_CoordinatorResponsePatternType()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(api_responsePatternOut)
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS)
      }
      val api_responsePatternOut = readFrigate_Threat_Response_CoordinatorResponsePatternType()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(api_responsePatternOut)
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P)
      }
      val api_alertStateIn = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_defenseChannelStateIn = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_defenseProposalIn = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      val api_escapeChannelStateIn = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_escapeProposalIn = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      val api_responsePatternIn = readFrigate_Threat_Response_CoordinatorResponsePatternType()
      val api_threatReportIn = readFrigate_Threat_Response_CoordinatorThreatReportType()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(api_alertStateIn, api_defenseChannelStateIn, api_defenseProposalIn, api_escapeChannelStateIn, api_escapeProposalIn, api_responsePatternIn, api_threatReportIn)
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS)
      }
      val api_alertStateIn = readFrigate_Threat_Response_CoordinatorAlertStateType()
      val api_defenseChannelStateIn = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_defenseProposalIn = readFrigate_Threat_Response_CoordinatorDefenseProposalType()
      val api_escapeChannelStateIn = readFrigate_Threat_Response_CoordinatorChannelStateType()
      val api_escapeProposalIn = readFrigate_Threat_Response_CoordinatorEscapeProposalType()
      val api_responsePatternIn = readFrigate_Threat_Response_CoordinatorResponsePatternType()
      val api_threatReportIn = readFrigate_Threat_Response_CoordinatorThreatReportType()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(api_alertStateIn, api_defenseChannelStateIn, api_defenseProposalIn, api_escapeChannelStateIn, api_escapeProposalIn, api_responsePatternIn, api_threatReportIn)
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P)
      }
      val api_responseFrameOut = readFrigate_Threat_Response_CoordinatorResponseFrame()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(api_responseFrameOut)
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS)
      }
      val api_responseFrameOut = readFrigate_Threat_Response_CoordinatorResponseFrame()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(api_responseFrameOut)
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
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T)
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
        case Constants.Frigate_Threat_Response_CoordinatorAlertState_Payload => val r = readFrigate_Threat_Response_CoordinatorAlertState_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatBand_Payload => val r = readFrigate_Threat_Response_CoordinatorThreatBand_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorChannelGate_Payload => val r = readFrigate_Threat_Response_CoordinatorChannelGate_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRouteStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorRouteStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorChannelState_Payload => val r = readFrigate_Threat_Response_CoordinatorChannelState_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReport_Payload => val r = readFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorContactClass_Payload => val r = readFrigate_Threat_Response_CoordinatorContactClass_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeOutcome_Payload => val r = readFrigate_Threat_Response_CoordinatorEscapeOutcome_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseStage_Payload => val r = readFrigate_Threat_Response_CoordinatorResponseStage_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseFrame_Payload => val r = readFrigate_Threat_Response_CoordinatorResponseFrame_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeProposal_Payload => val r = readFrigate_Threat_Response_CoordinatorEscapeProposal_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEvidenceStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorEvidenceStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatValidity_Payload => val r = readFrigate_Threat_Response_CoordinatorThreatValidity_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseOutcome_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseOutcome_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidence_Payload => val r = readFrigate_Threat_Response_CoordinatorThreatEvidence_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeDirective_Payload => val r = readFrigate_Threat_Response_CoordinatorEscapeDirective_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorMiningInterlock_Payload => val r = readFrigate_Threat_Response_CoordinatorMiningInterlock_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseProposal_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseProposal_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeAuthority_Payload => val r = readFrigate_Threat_Response_CoordinatorEscapeAuthority_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponsePattern_Payload => val r = readFrigate_Threat_Response_CoordinatorResponsePattern_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload => val r = readFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseDirective_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseDirective_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseAuthority_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseAuthority_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelCondition_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelCondition_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessContext_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T)
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

  def fromFrigate_Threat_Response_CoordinatorContactClass_Payload(o: Frigate_Threat_Response_Coordinator.ContactClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorContactClass_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorContactClass_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ContactClass_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactClass_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ContactClass_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorContactClass_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorContactClass_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatBand_Payload(o: Frigate_Threat_Response_Coordinator.ThreatBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatBand_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatBand_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatBand_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatBand_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatBand_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatBand_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatBand_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatValidity_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatValidity_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatValidity_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatValidity_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatValidity_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatValidity_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertState_Payload(o: Frigate_Threat_Response_Coordinator.AlertState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAlertState_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAlertState_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AlertState_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertState_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.AlertState_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAlertState_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAlertState_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReport_Payload(o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReport_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReport_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReport_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReport_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReport_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReport_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorChannelGate_Payload(o: Frigate_Threat_Response_Coordinator.ChannelGate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorChannelGate_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorChannelGate_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ChannelGate_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorChannelGate_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ChannelGate_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorChannelGate_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorChannelGate_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorChannelState_Payload(o: Frigate_Threat_Response_Coordinator.ChannelState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorChannelState_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorChannelState_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ChannelState_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorChannelState_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ChannelState_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorChannelState_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorChannelState_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o: Frigate_Threat_Response_Coordinator.RouteStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRouteStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RouteStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRouteStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.RouteStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRouteStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRouteStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.MiningInterlock_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.MiningInterlock_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorMiningInterlock_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorMiningInterlock_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseProposal_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseProposal_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseProposal_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseProposal_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeProposal_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeProposal_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeProposal_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeProposal_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponsePattern_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponsePattern_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponsePattern_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponsePattern_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponsePattern_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponsePattern_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseDirective_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseDirective_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseDirective_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeDirective_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeDirective_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeDirective_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseStage_Payload(o: Frigate_Threat_Response_Coordinator.ResponseStage_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseStage_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseStage_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseStage_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseStage_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseStage_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseStage_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseStage_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidence(o: Frigate_Threat_Response_Coordinator.ThreatEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidence(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidence(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidence, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidence(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidence = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidence()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidence_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorQualifiedThreat(o: Frigate_Threat_Response_Coordinator.QualifiedThreat, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorQualifiedThreat(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorQualifiedThreat(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.QualifiedThreat, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorQualifiedThreat(reader: Reader): Frigate_Threat_Response_Coordinator.QualifiedThreat = {
      val r = reader.readFrigate_Threat_Response_CoordinatorQualifiedThreat()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorQualifiedThreat _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessContext(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessContext, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessContext(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessContext = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessContext _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseFrame(o: Frigate_Threat_Response_Coordinator.ResponseFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseFrame(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseFrame(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseFrame, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseFrame(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseFrame = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseFrame()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseFrame _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseFrame_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseFrame_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseFrame_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseFrame_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseFrame_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseFrame_Payload _)
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

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS _)
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