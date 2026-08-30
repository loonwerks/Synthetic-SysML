// #Sireum
// @formatter:off

// This file is auto-generated from EvidenceBand.scala, ObservationValidity.scala, EvidenceAssessment.scala, PilotDisposition.scala, SnapshotPreEpisodeState.scala, SnapshotNextEpisodeState.scala, SnapshotEvidenceAssessment.scala, SnapshotPilotDisposition.scala, ThreatReport.scala, DefenseAvailability.scala, CapacitorSupport.scala, DefenseQualification.scala, EgressRouteObservation.scala, EgressQualification.scala, ResponseAuthorization.scala, ResponseDirective.scala, EgressProgress.scala, SnapshotPreEgressState.scala, SnapshotNextEgressState.scala, SnapshotResponseDirective.scala, SnapshotDefenseCommand.scala, SnapshotEgressCommand.scala, DefenseCommand.scala, EgressCommand.scala, ResponseStatus.scala, ThreatObservation.scala, EpisodeSnapshot.scala, DefenseSupportObservation.scala, ResponseSnapshot.scala, Base_Types.scala, ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_Containers.scala, ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_Containers.scala, ThreatReportPolicy_threatResponseProcess_threatReportPolicy_Containers.scala, DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_Containers.scala, EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_Containers.scala, ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_Containers.scala, ResponseStateController_threatResponseProcess_responseStateController_Containers.scala, ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package frigate_threat_egress_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Frigate_Threat_Egress_SupervisorEvidenceBand_Payload: Z = -32

    val Frigate_Threat_Egress_SupervisorObservationValidity_Payload: Z = -31

    val Frigate_Threat_Egress_SupervisorEvidenceAssessment_Payload: Z = -30

    val Frigate_Threat_Egress_SupervisorPilotDisposition_Payload: Z = -29

    val Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload: Z = -28

    val Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload: Z = -27

    val Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload: Z = -26

    val Frigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload: Z = -25

    val Frigate_Threat_Egress_SupervisorThreatReport_Payload: Z = -24

    val Frigate_Threat_Egress_SupervisorDefenseAvailability_Payload: Z = -23

    val Frigate_Threat_Egress_SupervisorCapacitorSupport_Payload: Z = -22

    val Frigate_Threat_Egress_SupervisorDefenseQualification_Payload: Z = -21

    val Frigate_Threat_Egress_SupervisorEgressRouteObservation_Payload: Z = -20

    val Frigate_Threat_Egress_SupervisorEgressQualification_Payload: Z = -19

    val Frigate_Threat_Egress_SupervisorResponseAuthorization_Payload: Z = -18

    val Frigate_Threat_Egress_SupervisorResponseDirective_Payload: Z = -17

    val Frigate_Threat_Egress_SupervisorEgressProgress_Payload: Z = -16

    val Frigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload: Z = -15

    val Frigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload: Z = -14

    val Frigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload: Z = -13

    val Frigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload: Z = -12

    val Frigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload: Z = -11

    val Frigate_Threat_Egress_SupervisorDefenseCommand_Payload: Z = -10

    val Frigate_Threat_Egress_SupervisorEgressCommand_Payload: Z = -9

    val Frigate_Threat_Egress_SupervisorResponseStatus_Payload: Z = -8

    val Frigate_Threat_Egress_SupervisorThreatObservation: Z = -7

    val Frigate_Threat_Egress_SupervisorThreatObservation_Payload: Z = -6

    val Frigate_Threat_Egress_SupervisorEpisodeSnapshot: Z = -5

    val Frigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload: Z = -4

    val Frigate_Threat_Egress_SupervisorDefenseSupportObservation: Z = -3

    val Frigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload: Z = -2

    val Frigate_Threat_Egress_SupervisorResponseSnapshot: Z = -1

    val Frigate_Threat_Egress_SupervisorResponseSnapshot_Payload: Z = 0

    val Base_TypesBoolean_Payload: Z = 1

    val Base_TypesInteger_Payload: Z = 2

    val Base_TypesInteger_8_Payload: Z = 3

    val Base_TypesInteger_16_Payload: Z = 4

    val Base_TypesInteger_32_Payload: Z = 5

    val Base_TypesInteger_64_Payload: Z = 6

    val Base_TypesUnsigned_8_Payload: Z = 7

    val Base_TypesUnsigned_16_Payload: Z = 8

    val Base_TypesUnsigned_32_Payload: Z = 9

    val Base_TypesUnsigned_64_Payload: Z = 10

    val Base_TypesFloat_Payload: Z = 11

    val Base_TypesFloat_32_Payload: Z = 12

    val Base_TypesFloat_64_Payload: Z = 13

    val Base_TypesCharacter_Payload: Z = 14

    val Base_TypesString_Payload: Z = 15

    val Base_TypesBits_Payload: Z = 16

    val Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P: Z = 17

    val Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS: Z = 18

    val Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P: Z = 19

    val Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS: Z = 20

    val Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P: Z = 21

    val Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS: Z = 22

    val Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P: Z = 23

    val Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS: Z = 24

    val Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P: Z = 25

    val Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS: Z = 26

    val Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P: Z = 27

    val Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS: Z = 28

    val Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P: Z = 29

    val Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS: Z = 30

    val Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P: Z = 31

    val Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS: Z = 32

    val Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P: Z = 33

    val Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS: Z = 34

    val Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P: Z = 35

    val Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS: Z = 36

    val Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P: Z = 37

    val Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS: Z = 38

    val Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P: Z = 39

    val Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS: Z = 40

    val Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P: Z = 41

    val Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS: Z = 42

    val Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P: Z = 43

    val Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS: Z = 44

    val Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P: Z = 45

    val Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS: Z = 46

    val Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P: Z = 47

    val Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS: Z = 48

    val utilEmptyContainer: Z = 49

    val _artEmpty: Z = 50

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFrigate_Threat_Egress_SupervisorEvidenceBandType(o: Frigate_Threat_Egress_Supervisor.EvidenceBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEvidenceBand_Payload)
      writeFrigate_Threat_Egress_SupervisorEvidenceBandType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorObservationValidityType(o: Frigate_Threat_Egress_Supervisor.ObservationValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorObservationValidity_Payload)
      writeFrigate_Threat_Egress_SupervisorObservationValidityType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEvidenceAssessment_Payload)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorPilotDispositionType(o: Frigate_Threat_Egress_Supervisor.PilotDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorPilotDisposition_Payload)
      writeFrigate_Threat_Egress_SupervisorPilotDispositionType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReportType(o: Frigate_Threat_Egress_Supervisor.ThreatReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReport_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatReport_Payload)
      writeFrigate_Threat_Egress_SupervisorThreatReportType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(o: Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseAvailability_Payload)
      writeFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorCapacitorSupportType(o: Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorCapacitorSupport_Payload)
      writeFrigate_Threat_Egress_SupervisorCapacitorSupportType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseQualificationType(o: Frigate_Threat_Egress_Supervisor.DefenseQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseQualification_Payload)
      writeFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressRouteObservation_Payload)
      writeFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressQualificationType(o: Frigate_Threat_Egress_Supervisor.EgressQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressQualification_Payload)
      writeFrigate_Threat_Egress_SupervisorEgressQualificationType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseAuthorization_Payload)
      writeFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseDirectiveType(o: Frigate_Threat_Egress_Supervisor.ResponseDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseDirective_Payload)
      writeFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressProgressType(o: Frigate_Threat_Egress_Supervisor.EgressProgress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressProgress_Payload)
      writeFrigate_Threat_Egress_SupervisorEgressProgressType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload)
      writeFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseCommandType(o: Frigate_Threat_Egress_Supervisor.DefenseCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseCommand_Payload)
      writeFrigate_Threat_Egress_SupervisorDefenseCommandType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressCommandType(o: Frigate_Threat_Egress_Supervisor.EgressCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressCommand_Payload)
      writeFrigate_Threat_Egress_SupervisorEgressCommandType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatusType(o: Frigate_Threat_Egress_Supervisor.ResponseStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatus_Payload)
      writeFrigate_Threat_Egress_SupervisorResponseStatusType(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatObservation(o: Frigate_Threat_Egress_Supervisor.ThreatObservation): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatObservation)
      writeFrigate_Threat_Egress_SupervisorEvidenceBandType(o.evidenceBand)
      writeFrigate_Threat_Egress_SupervisorObservationValidityType(o.validity)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatObservation_Payload)
      writeFrigate_Threat_Egress_SupervisorThreatObservation(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEpisodeSnapshot)
      writeFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(o.preEpisode)
      writeFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(o.nextEpisode)
      writeFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(o.assessment)
      writeFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(o.pilotDisposition)
    }

    def writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseSupportObservation)
      writeFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(o.defenseAvailability)
      writeFrigate_Threat_Egress_SupervisorCapacitorSupportType(o.capacitorSupport)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload)
      writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o.value)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseSnapshot(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseSnapshot)
      writeFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(o.preEgress)
      writeFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(o.nextEgress)
      writeFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(o.directive)
      writeFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(o.defenseCommand)
      writeFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(o.egressCommand)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseSnapshot_Payload)
      writeFrigate_Threat_Egress_SupervisorResponseSnapshot(o.value)
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

    def writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorThreatObservation(o.api_threatObservation)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorThreatObservation(o.api_threatObservation)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
      writeFrigate_Threat_Egress_SupervisorPilotDispositionType(o.api_pilotDisposition)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
      writeFrigate_Threat_Egress_SupervisorPilotDispositionType(o.api_pilotDisposition)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorThreatReportType(o.api_threatReport)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorThreatReportType(o.api_threatReport)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o.api_defenseSupport)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o.api_defenseSupport)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification)
    }

    def writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o.api_egressRoute)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o.api_egressRoute)
      writeFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification)
    }

    def writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification)
      writeFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
      writeFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o.api_responseAuthorization)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification)
      writeFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
      writeFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o.api_responseAuthorization)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective)
    }

    def writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEgressProgressType(o.api_egressProgress)
      writeFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEgressProgressType(o.api_egressProgress)
      writeFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorDefenseCommandType(o.api_defenseCommand)
      writeFrigate_Threat_Egress_SupervisorEgressCommandType(o.api_egressCommand)
      writeFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorDefenseCommandType(o.api_defenseCommand)
      writeFrigate_Threat_Egress_SupervisorEgressCommandType(o.api_egressCommand)
      writeFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
      writeFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)
      writeFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P)
      writeFrigate_Threat_Egress_SupervisorResponseStatusType(o.api_responseStatus)
    }

    def writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS)
      writeFrigate_Threat_Egress_SupervisorResponseStatusType(o.api_responseStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
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
        case o: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload => writeFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload => writeFrigate_Threat_Egress_SupervisorThreatReport_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload => writeFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload => writeFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload => writeFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload => writeFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload => writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload => writeFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload => writeFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload => writeFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload => writeFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload => writeFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload => writeFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload => writeFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload => writeFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload => writeFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload => writeFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload => writeFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload => writeFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload => writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload => writeFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
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

    def readFrigate_Threat_Egress_SupervisorEvidenceBandType(): Frigate_Threat_Egress_Supervisor.EvidenceBand.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.EvidenceBand.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(): Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorEvidenceBand_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEvidenceBand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEvidenceBand_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorEvidenceBandType()
      return Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorObservationValidityType(): Frigate_Threat_Egress_Supervisor.ObservationValidity.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.ObservationValidity.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorObservationValidity_Payload(): Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorObservationValidity_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorObservationValidity_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorObservationValidity_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorObservationValidityType()
      return Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(): Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.EvidenceAssessment.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(): Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorEvidenceAssessment_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEvidenceAssessment_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEvidenceAssessment_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorPilotDispositionType(): Frigate_Threat_Egress_Supervisor.PilotDisposition.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.PilotDisposition.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(): Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorPilotDisposition_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorPilotDisposition_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorPilotDisposition_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorPilotDispositionType()
      return Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType()
      return Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType()
      return Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType()
      return Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportType(): Frigate_Threat_Egress_Supervisor.ThreatReport.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.ThreatReport.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorThreatReport_Payload(): Frigate_Threat_Egress_Supervisor.ThreatReport_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorThreatReport_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatReport_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatReport_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorThreatReportType()
      return Frigate_Threat_Egress_Supervisor.ThreatReport_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(): Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.DefenseAvailability.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(): Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseAvailability_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseAvailability_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseAvailability_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorDefenseAvailabilityType()
      return Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorCapacitorSupportType(): Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.CapacitorSupport.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(): Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorCapacitorSupport_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorCapacitorSupport_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorCapacitorSupport_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorCapacitorSupportType()
      return Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseQualificationType(): Frigate_Threat_Egress_Supervisor.DefenseQualification.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.DefenseQualification.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(): Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseQualification_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseQualification_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseQualification_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      return Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorEgressRouteObservationType(): Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.EgressRouteObservation.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(): Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorEgressRouteObservation_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressRouteObservation_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressRouteObservation_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorEgressRouteObservationType()
      return Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorEgressQualificationType(): Frigate_Threat_Egress_Supervisor.EgressQualification.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.EgressQualification.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorEgressQualification_Payload(): Frigate_Threat_Egress_Supervisor.EgressQualification_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorEgressQualification_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressQualification_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressQualification_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorEgressQualificationType()
      return Frigate_Threat_Egress_Supervisor.EgressQualification_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorResponseAuthorizationType(): Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.ResponseAuthorization.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(): Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorResponseAuthorization_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseAuthorization_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseAuthorization_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorResponseAuthorizationType()
      return Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorResponseDirectiveType(): Frigate_Threat_Egress_Supervisor.ResponseDirective.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.ResponseDirective.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorResponseDirective_Payload(): Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorResponseDirective_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseDirective_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseDirective_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      return Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorEgressProgressType(): Frigate_Threat_Egress_Supervisor.EgressProgress.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.EgressProgress.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorEgressProgress_Payload(): Frigate_Threat_Egress_Supervisor.EgressProgress_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorEgressProgress_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressProgress_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressProgress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressProgress_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorEgressProgressType()
      return Frigate_Threat_Egress_Supervisor.EgressProgress_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType()
      return Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType()
      return Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType()
      return Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType()
      return Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType()
      return Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseCommandType(): Frigate_Threat_Egress_Supervisor.DefenseCommand.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.DefenseCommand.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(): Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseCommand_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseCommand_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorDefenseCommandType()
      return Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorEgressCommandType(): Frigate_Threat_Egress_Supervisor.EgressCommand.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.EgressCommand.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorEgressCommand_Payload(): Frigate_Threat_Egress_Supervisor.EgressCommand_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorEgressCommand_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressCommand_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorEgressCommandType()
      return Frigate_Threat_Egress_Supervisor.EgressCommand_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusType(): Frigate_Threat_Egress_Supervisor.ResponseStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Egress_Supervisor.ResponseStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatus_Payload(): Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatus_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatus_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorResponseStatusType()
      return Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorThreatObservation(): Frigate_Threat_Egress_Supervisor.ThreatObservation = {
      val r = readFrigate_Threat_Egress_SupervisorThreatObservationT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatObservationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatObservation)
      }
      val evidenceBand = readFrigate_Threat_Egress_SupervisorEvidenceBandType()
      val validity = readFrigate_Threat_Egress_SupervisorObservationValidityType()
      return Frigate_Threat_Egress_Supervisor.ThreatObservation(evidenceBand, validity)
    }

    def readFrigate_Threat_Egress_SupervisorThreatObservation_Payload(): Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorThreatObservation_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatObservation_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatObservation_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorThreatObservation()
      return Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorEpisodeSnapshot(): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = {
      val r = readFrigate_Threat_Egress_SupervisorEpisodeSnapshotT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEpisodeSnapshotT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEpisodeSnapshot)
      }
      val preEpisode = readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType()
      val nextEpisode = readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType()
      val assessment = readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType()
      val pilotDisposition = readFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType()
      return Frigate_Threat_Egress_Supervisor.EpisodeSnapshot(preEpisode, nextEpisode, assessment, pilotDisposition)
    }

    def readFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEpisodeSnapshot_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      return Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseSupportObservation(): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseSupportObservationT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseSupportObservationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseSupportObservation)
      }
      val defenseAvailability = readFrigate_Threat_Egress_SupervisorDefenseAvailabilityType()
      val capacitorSupport = readFrigate_Threat_Egress_SupervisorCapacitorSupportType()
      return Frigate_Threat_Egress_Supervisor.DefenseSupportObservation(defenseAvailability, capacitorSupport)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseSupportObservation_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseSupportObservation_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      return Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload(value)
    }

    def readFrigate_Threat_Egress_SupervisorResponseSnapshot(): Frigate_Threat_Egress_Supervisor.ResponseSnapshot = {
      val r = readFrigate_Threat_Egress_SupervisorResponseSnapshotT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseSnapshotT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseSnapshot)
      }
      val preEgress = readFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType()
      val nextEgress = readFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType()
      val directive = readFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType()
      val defenseCommand = readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType()
      val egressCommand = readFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType()
      return Frigate_Threat_Egress_Supervisor.ResponseSnapshot(preEgress, nextEgress, directive, defenseCommand, egressCommand)
    }

    def readFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(): Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload = {
      val r = readFrigate_Threat_Egress_SupervisorResponseSnapshot_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseSnapshot_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseSnapshot_Payload)
      }
      val value = readFrigate_Threat_Egress_SupervisorResponseSnapshot()
      return Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload(value)
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

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P)
      }
      val api_threatObservation = readFrigate_Threat_Egress_SupervisorThreatObservation()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(api_threatObservation)
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS)
      }
      val api_threatObservation = readFrigate_Threat_Egress_SupervisorThreatObservation()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(api_threatObservation)
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P)
      }
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(api_evidenceAssessment)
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS)
      }
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(api_evidenceAssessment)
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P)
      }
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      val api_pilotDisposition = readFrigate_Threat_Egress_SupervisorPilotDispositionType()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(api_evidenceAssessment, api_pilotDisposition)
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS)
      }
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      val api_pilotDisposition = readFrigate_Threat_Egress_SupervisorPilotDispositionType()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(api_evidenceAssessment, api_pilotDisposition)
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P)
      }
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(api_episodeSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS)
      }
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(api_episodeSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P)
      }
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(api_episodeSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS)
      }
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(api_episodeSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P)
      }
      val api_threatReport = readFrigate_Threat_Egress_SupervisorThreatReportType()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(api_threatReport)
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS)
      }
      val api_threatReport = readFrigate_Threat_Egress_SupervisorThreatReportType()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(api_threatReport)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P)
      }
      val api_defenseSupport = readFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(api_defenseSupport, api_evidenceAssessment)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS)
      }
      val api_defenseSupport = readFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(api_defenseSupport, api_evidenceAssessment)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P)
      }
      val api_defenseQualification = readFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(api_defenseQualification)
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS)
      }
      val api_defenseQualification = readFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(api_defenseQualification)
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P)
      }
      val api_egressRoute = readFrigate_Threat_Egress_SupervisorEgressRouteObservationType()
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(api_egressRoute, api_evidenceAssessment)
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS)
      }
      val api_egressRoute = readFrigate_Threat_Egress_SupervisorEgressRouteObservationType()
      val api_evidenceAssessment = readFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(api_egressRoute, api_evidenceAssessment)
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P)
      }
      val api_egressQualification = readFrigate_Threat_Egress_SupervisorEgressQualificationType()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(api_egressQualification)
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS)
      }
      val api_egressQualification = readFrigate_Threat_Egress_SupervisorEgressQualificationType()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(api_egressQualification)
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P)
      }
      val api_defenseQualification = readFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      val api_egressQualification = readFrigate_Threat_Egress_SupervisorEgressQualificationType()
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      val api_responseAuthorization = readFrigate_Threat_Egress_SupervisorResponseAuthorizationType()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(api_defenseQualification, api_egressQualification, api_episodeSnapshot, api_responseAuthorization)
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS)
      }
      val api_defenseQualification = readFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      val api_egressQualification = readFrigate_Threat_Egress_SupervisorEgressQualificationType()
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      val api_responseAuthorization = readFrigate_Threat_Egress_SupervisorResponseAuthorizationType()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(api_defenseQualification, api_egressQualification, api_episodeSnapshot, api_responseAuthorization)
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P)
      }
      val api_responseDirective = readFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(api_responseDirective)
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS)
      }
      val api_responseDirective = readFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(api_responseDirective)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P)
      }
      val api_egressProgress = readFrigate_Threat_Egress_SupervisorEgressProgressType()
      val api_responseDirective = readFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(api_egressProgress, api_responseDirective)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS)
      }
      val api_egressProgress = readFrigate_Threat_Egress_SupervisorEgressProgressType()
      val api_responseDirective = readFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(api_egressProgress, api_responseDirective)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P)
      }
      val api_defenseCommand = readFrigate_Threat_Egress_SupervisorDefenseCommandType()
      val api_egressCommand = readFrigate_Threat_Egress_SupervisorEgressCommandType()
      val api_responseSnapshot = readFrigate_Threat_Egress_SupervisorResponseSnapshot()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(api_defenseCommand, api_egressCommand, api_responseSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS)
      }
      val api_defenseCommand = readFrigate_Threat_Egress_SupervisorDefenseCommandType()
      val api_egressCommand = readFrigate_Threat_Egress_SupervisorEgressCommandType()
      val api_responseSnapshot = readFrigate_Threat_Egress_SupervisorResponseSnapshot()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(api_defenseCommand, api_egressCommand, api_responseSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P)
      }
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      val api_responseSnapshot = readFrigate_Threat_Egress_SupervisorResponseSnapshot()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(api_episodeSnapshot, api_responseSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS)
      }
      val api_episodeSnapshot = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      val api_responseSnapshot = readFrigate_Threat_Egress_SupervisorResponseSnapshot()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(api_episodeSnapshot, api_responseSnapshot)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container.")
          val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P)
      }
      val api_responseStatus = readFrigate_Threat_Egress_SupervisorResponseStatusType()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(api_responseStatus)
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS = {
      val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS)
      }
      val api_responseStatus = readFrigate_Threat_Egress_SupervisorResponseStatusType()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(api_responseStatus)
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
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T)
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
        case Constants.Frigate_Threat_Egress_SupervisorEvidenceBand_Payload => val r = readFrigate_Threat_Egress_SupervisorEvidenceBand_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReport_Payload => val r = readFrigate_Threat_Egress_SupervisorThreatReport_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressCommand_Payload => val r = readFrigate_Threat_Egress_SupervisorEgressCommand_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseCommand_Payload => val r = readFrigate_Threat_Egress_SupervisorDefenseCommand_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressProgress_Payload => val r = readFrigate_Threat_Egress_SupervisorEgressProgress_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatus_Payload => val r = readFrigate_Threat_Egress_SupervisorResponseStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload => val r = readFrigate_Threat_Egress_SupervisorEpisodeSnapshot_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorCapacitorSupport_Payload => val r = readFrigate_Threat_Egress_SupervisorCapacitorSupport_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorPilotDisposition_Payload => val r = readFrigate_Threat_Egress_SupervisorPilotDisposition_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseSnapshot_Payload => val r = readFrigate_Threat_Egress_SupervisorResponseSnapshot_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseDirective_Payload => val r = readFrigate_Threat_Egress_SupervisorResponseDirective_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatObservation_Payload => val r = readFrigate_Threat_Egress_SupervisorThreatObservation_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEvidenceAssessment_Payload => val r = readFrigate_Threat_Egress_SupervisorEvidenceAssessment_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorObservationValidity_Payload => val r = readFrigate_Threat_Egress_SupervisorObservationValidity_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseAvailability_Payload => val r = readFrigate_Threat_Egress_SupervisorDefenseAvailability_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressQualification_Payload => val r = readFrigate_Threat_Egress_SupervisorEgressQualification_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseQualification_Payload => val r = readFrigate_Threat_Egress_SupervisorDefenseQualification_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseAuthorization_Payload => val r = readFrigate_Threat_Egress_SupervisorResponseAuthorization_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressRouteObservation_Payload => val r = readFrigate_Threat_Egress_SupervisorEgressRouteObservation_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload => val r = readFrigate_Threat_Egress_SupervisorDefenseSupportObservation_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload => val r = readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_PayloadT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T)
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

  def fromFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEvidenceBand_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEvidenceBand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorObservationValidity_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorObservationValidity_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorObservationValidity_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorObservationValidity_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorPilotDisposition_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorPilotDisposition_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReport_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatReport_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatReport_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatReport_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReport_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatReport_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatReport_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatReport_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseQualification_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseQualification_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressQualification_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressQualification_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressQualification_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressQualification_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressQualification_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressQualification_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseDirective_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseDirective_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseDirective_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressProgress_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressProgress_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressProgress_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressProgress_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressProgress_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressProgress_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseCommand_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressCommand_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressCommand_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressCommand_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressCommand_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressCommand_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatus_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatObservation(o: Frigate_Threat_Egress_Supervisor.ThreatObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatObservation(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatObservation(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatObservation, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatObservation(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatObservation = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatObservation()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatObservation _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatObservation_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatObservation_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatObservation_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatObservation_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEpisodeSnapshot(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EpisodeSnapshot, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEpisodeSnapshot(reader: Reader): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEpisodeSnapshot _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseSupportObservation(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseSupportObservation, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseSupportObservation(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseSupportObservation _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseSnapshot(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseSnapshot(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseSnapshot(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseSnapshot, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseSnapshot(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseSnapshot = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseSnapshot()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseSnapshot _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload _)
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

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(reader: Reader): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS _)
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