// #Sireum
// @formatter:off

// This file is auto-generated from ContactSignature.scala, ContactSignatureStatus.scala, ContactIdentity.scala, IdentityStatus.scala, QualifiedThreat.scala, DefenseAvailability.scala, DefenseAvailabilityStatus.scala, DroneReadiness.scala, DroneReadinessStatus.scala, DefenseCondition.scala, DestinationStatus.scala, DestinationEvidenceStatus.scala, WarpProgress.scala, WarpProgressStatus.scala, RetreatCondition.scala, ResponseRequestValue.scala, RequestStatus.scala, DefenseActivation.scala, RetreatNavigationCommand.scala, ResponseDisposition.scala, AcknowledgmentValue.scala, AcknowledgmentStatus.scala, ReportPriority.scala, ResponseCommitment.scala, ContactEvidence.scala, IdentificationEvidence.scala, DefenseEvidence.scala, RetreatNavigationEvidence.scala, ResponseRequest.scala, ResponseRecord.scala, ReportAcknowledgment.scala, ThreatReport.scala, Base_Types.scala, ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_Containers.scala, DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_Containers.scala, RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_Containers.scala, PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_Containers.scala, ThreatReportComposer_threatResponseProcess_threatReportComposer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Frigate_Threat_Response_CoordinatorContactSignature_Payload: Z = -32

    val Frigate_Threat_Response_CoordinatorContactSignatureStatus_Payload: Z = -31

    val Frigate_Threat_Response_CoordinatorContactIdentity_Payload: Z = -30

    val Frigate_Threat_Response_CoordinatorIdentityStatus_Payload: Z = -29

    val Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload: Z = -28

    val Frigate_Threat_Response_CoordinatorDefenseAvailability_Payload: Z = -27

    val Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload: Z = -26

    val Frigate_Threat_Response_CoordinatorDroneReadiness_Payload: Z = -25

    val Frigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload: Z = -24

    val Frigate_Threat_Response_CoordinatorDefenseCondition_Payload: Z = -23

    val Frigate_Threat_Response_CoordinatorDestinationStatus_Payload: Z = -22

    val Frigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload: Z = -21

    val Frigate_Threat_Response_CoordinatorWarpProgress_Payload: Z = -20

    val Frigate_Threat_Response_CoordinatorWarpProgressStatus_Payload: Z = -19

    val Frigate_Threat_Response_CoordinatorRetreatCondition_Payload: Z = -18

    val Frigate_Threat_Response_CoordinatorResponseRequestValue_Payload: Z = -17

    val Frigate_Threat_Response_CoordinatorRequestStatus_Payload: Z = -16

    val Frigate_Threat_Response_CoordinatorDefenseActivation_Payload: Z = -15

    val Frigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload: Z = -14

    val Frigate_Threat_Response_CoordinatorResponseDisposition_Payload: Z = -13

    val Frigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload: Z = -12

    val Frigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload: Z = -11

    val Frigate_Threat_Response_CoordinatorReportPriority_Payload: Z = -10

    val Frigate_Threat_Response_CoordinatorResponseCommitment_Payload: Z = -9

    val Frigate_Threat_Response_CoordinatorContactEvidence: Z = -8

    val Frigate_Threat_Response_CoordinatorContactEvidence_Payload: Z = -7

    val Frigate_Threat_Response_CoordinatorIdentificationEvidence: Z = -6

    val Frigate_Threat_Response_CoordinatorIdentificationEvidence_Payload: Z = -5

    val Frigate_Threat_Response_CoordinatorDefenseEvidence: Z = -4

    val Frigate_Threat_Response_CoordinatorDefenseEvidence_Payload: Z = -3

    val Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence: Z = -2

    val Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload: Z = -1

    val Frigate_Threat_Response_CoordinatorResponseRequest: Z = 0

    val Frigate_Threat_Response_CoordinatorResponseRequest_Payload: Z = 1

    val Frigate_Threat_Response_CoordinatorResponseRecord: Z = 2

    val Frigate_Threat_Response_CoordinatorResponseRecord_Payload: Z = 3

    val Frigate_Threat_Response_CoordinatorReportAcknowledgment: Z = 4

    val Frigate_Threat_Response_CoordinatorReportAcknowledgment_Payload: Z = 5

    val Frigate_Threat_Response_CoordinatorThreatReport: Z = 6

    val Frigate_Threat_Response_CoordinatorThreatReport_Payload: Z = 7

    val Base_TypesBoolean_Payload: Z = 8

    val Base_TypesInteger_Payload: Z = 9

    val Base_TypesInteger_8_Payload: Z = 10

    val Base_TypesInteger_16_Payload: Z = 11

    val Base_TypesInteger_32_Payload: Z = 12

    val Base_TypesInteger_64_Payload: Z = 13

    val Base_TypesUnsigned_8_Payload: Z = 14

    val Base_TypesUnsigned_16_Payload: Z = 15

    val Base_TypesUnsigned_32_Payload: Z = 16

    val Base_TypesUnsigned_64_Payload: Z = 17

    val Base_TypesFloat_Payload: Z = 18

    val Base_TypesFloat_32_Payload: Z = 19

    val Base_TypesFloat_64_Payload: Z = 20

    val Base_TypesCharacter_Payload: Z = 21

    val Base_TypesString_Payload: Z = 22

    val Base_TypesBits_Payload: Z = 23

    val Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P: Z = 24

    val Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS: Z = 25

    val Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P: Z = 26

    val Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS: Z = 27

    val Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P: Z = 28

    val Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS: Z = 29

    val Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P: Z = 30

    val Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS: Z = 31

    val Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P: Z = 32

    val Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS: Z = 33

    val Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P: Z = 34

    val Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS: Z = 35

    val Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P: Z = 36

    val Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS: Z = 37

    val Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P: Z = 38

    val Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS: Z = 39

    val Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P: Z = 40

    val Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS: Z = 41

    val Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P: Z = 42

    val Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS: Z = 43

    val utilEmptyContainer: Z = 44

    val _artEmpty: Z = 45

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFrigate_Threat_Response_CoordinatorContactSignatureType(o: Frigate_Threat_Response_Coordinator.ContactSignature.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorContactSignature_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignature_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorContactSignature_Payload)
      writeFrigate_Threat_Response_CoordinatorContactSignatureType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorContactSignatureStatusType(o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorContactSignatureStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorContactSignatureStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorContactIdentityType(o: Frigate_Threat_Response_Coordinator.ContactIdentity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorContactIdentity_Payload)
      writeFrigate_Threat_Response_CoordinatorContactIdentityType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorIdentityStatusType(o: Frigate_Threat_Response_Coordinator.IdentityStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorIdentityStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorIdentityStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(o: Frigate_Threat_Response_Coordinator.DefenseAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseAvailability_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDroneReadinessType(o: Frigate_Threat_Response_Coordinator.DroneReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDroneReadiness_Payload)
      writeFrigate_Threat_Response_CoordinatorDroneReadinessType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseConditionType(o: Frigate_Threat_Response_Coordinator.DefenseCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseCondition_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseConditionType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDestinationStatusType(o: Frigate_Threat_Response_Coordinator.DestinationStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDestinationStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorDestinationStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorWarpProgressType(o: Frigate_Threat_Response_Coordinator.WarpProgress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgress_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorWarpProgress_Payload)
      writeFrigate_Threat_Response_CoordinatorWarpProgressType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorWarpProgressStatusType(o: Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorWarpProgressStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorWarpProgressStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatConditionType(o: Frigate_Threat_Response_Coordinator.RetreatCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatCondition_Payload)
      writeFrigate_Threat_Response_CoordinatorRetreatConditionType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseRequestValueType(o: Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseRequestValue_Payload)
      writeFrigate_Threat_Response_CoordinatorResponseRequestValueType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorRequestStatusType(o: Frigate_Threat_Response_Coordinator.RequestStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o: Frigate_Threat_Response_Coordinator.RequestStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRequestStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorRequestStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivationType(o: Frigate_Threat_Response_Coordinator.DefenseActivation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivation_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseActivationType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload)
      writeFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseDispositionType(o: Frigate_Threat_Response_Coordinator.ResponseDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseDisposition_Payload)
      writeFrigate_Threat_Response_CoordinatorResponseDispositionType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload)
      writeFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload)
      writeFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorReportPriorityType(o: Frigate_Threat_Response_Coordinator.ReportPriority.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorReportPriority_Payload(o: Frigate_Threat_Response_Coordinator.ReportPriority_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorReportPriority_Payload)
      writeFrigate_Threat_Response_CoordinatorReportPriorityType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCommitmentType(o: Frigate_Threat_Response_Coordinator.ResponseCommitment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseCommitment_Payload(o: Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseCommitment_Payload)
      writeFrigate_Threat_Response_CoordinatorResponseCommitmentType(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorContactEvidence(o: Frigate_Threat_Response_Coordinator.ContactEvidence): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorContactEvidence)
      writeFrigate_Threat_Response_CoordinatorContactSignatureType(o.signature)
      writeFrigate_Threat_Response_CoordinatorContactSignatureStatusType(o.signatureStatus)
    }

    def writeFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorContactEvidence_Payload)
      writeFrigate_Threat_Response_CoordinatorContactEvidence(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorIdentificationEvidence(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorIdentificationEvidence)
      writeFrigate_Threat_Response_CoordinatorContactIdentityType(o.identity)
      writeFrigate_Threat_Response_CoordinatorIdentityStatusType(o.identityStatus)
    }

    def writeFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorIdentificationEvidence_Payload)
      writeFrigate_Threat_Response_CoordinatorIdentificationEvidence(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseEvidence(o: Frigate_Threat_Response_Coordinator.DefenseEvidence): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseEvidence)
      writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(o.defenseAvailable)
      writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(o.defenseStatus)
      writeFrigate_Threat_Response_CoordinatorDroneReadinessType(o.droneReadiness)
      writeFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(o.droneStatus)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseEvidence_Payload)
      writeFrigate_Threat_Response_CoordinatorDefenseEvidence(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence)
      writeFrigate_Threat_Response_CoordinatorDestinationStatusType(o.destination)
      writeFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(o.destinationStatus)
      writeFrigate_Threat_Response_CoordinatorWarpProgressType(o.warpProgress)
      writeFrigate_Threat_Response_CoordinatorWarpProgressStatusType(o.warpStatus)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload)
      writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseRequest(o: Frigate_Threat_Response_Coordinator.ResponseRequest): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseRequest)
      writeFrigate_Threat_Response_CoordinatorResponseRequestValueType(o.request)
      writeFrigate_Threat_Response_CoordinatorRequestStatusType(o.requestStatus)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseRequest_Payload)
      writeFrigate_Threat_Response_CoordinatorResponseRequest(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseRecord(o: Frigate_Threat_Response_Coordinator.ResponseRecord): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseRecord)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.qualifiedThreat)
      writeFrigate_Threat_Response_CoordinatorResponseDispositionType(o.disposition)
    }

    def writeFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorResponseRecord_Payload)
      writeFrigate_Threat_Response_CoordinatorResponseRecord(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorReportAcknowledgment(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorReportAcknowledgment)
      writeFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(o.acknowledgment)
      writeFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(o.acknowledgmentStatus)
    }

    def writeFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorReportAcknowledgment_Payload)
      writeFrigate_Threat_Response_CoordinatorReportAcknowledgment(o.value)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReport(o: Frigate_Threat_Response_Coordinator.ThreatReport): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatReport)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.qualifiedThreat)
      writeFrigate_Threat_Response_CoordinatorResponseDispositionType(o.disposition)
      writeFrigate_Threat_Response_CoordinatorReportPriorityType(o.priority)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReport_Payload(o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatReport_Payload)
      writeFrigate_Threat_Response_CoordinatorThreatReport(o.value)
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

    def writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorContactEvidence(o.api_contactEvidence)
      writeFrigate_Threat_Response_CoordinatorIdentificationEvidence(o.api_identificationEvidence)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorContactEvidence(o.api_contactEvidence)
      writeFrigate_Threat_Response_CoordinatorIdentificationEvidence(o.api_identificationEvidence)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorDefenseEvidence(o.api_defenseEvidence)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorDefenseEvidence(o.api_defenseEvidence)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition)
    }

    def writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o.api_retreatNavigationEvidence)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o.api_retreatNavigationEvidence)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition)
    }

    def writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition)
    }

    def writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat)
      writeFrigate_Threat_Response_CoordinatorResponseRequest(o.api_responseRequest)
      writeFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition)
    }

    def writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorResponseCommitmentType(o.In_responseCommitment)
      writer.writeB(o.In_retreatRequestArmed)
      writeFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition)
      writeFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat)
      writeFrigate_Threat_Response_CoordinatorResponseRequest(o.api_responseRequest)
      writeFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition)
    }

    def writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorDefenseActivationType(o.api_defenseActivation)
      writeFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord)
      writeFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o.api_retreatNavigationCommand)
    }

    def writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorResponseCommitmentType(o.responseCommitment)
      writer.writeB(o.retreatRequestArmed)
      writeFrigate_Threat_Response_CoordinatorDefenseActivationType(o.api_defenseActivation)
      writeFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord)
      writeFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o.api_retreatNavigationCommand)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P)
      writeFrigate_Threat_Response_CoordinatorReportAcknowledgment(o.api_reportAcknowledgment)
      writeFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorReportAcknowledgment(o.api_reportAcknowledgment)
      writeFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container): Unit = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
      }
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P)
      writeFrigate_Threat_Response_CoordinatorThreatReport(o.api_threatReport)
    }

    def writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS)
      writeFrigate_Threat_Response_CoordinatorThreatReport(o.api_threatReport)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
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
        case o: Frigate_Threat_Response_Coordinator.WarpProgress_Payload => writeFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload => writeFrigate_Threat_Response_CoordinatorThreatReport_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RequestStatus_Payload => writeFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload => writeFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload => writeFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ReportPriority_Payload => writeFrigate_Threat_Response_CoordinatorReportPriority_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload => writeFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload => writeFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload => writeFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload => writeFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload => writeFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload => writeFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactSignature_Payload => writeFrigate_Threat_Response_CoordinatorContactSignature_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload => writeFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload => writeFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload => writeFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload => writeFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload => writeFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload => writeFrigate_Threat_Response_CoordinatorResponseCommitment_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload => writeFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload => writeFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload => writeFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload => writeFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload => writeFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload => writeFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload => writeFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload => writeFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload => writeFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload => writeFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload => writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload => writeFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload => writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
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

    def readFrigate_Threat_Response_CoordinatorContactSignatureType(): Frigate_Threat_Response_Coordinator.ContactSignature.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ContactSignature.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorContactSignature_Payload(): Frigate_Threat_Response_Coordinator.ContactSignature_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorContactSignature_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorContactSignature_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactSignature_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorContactSignature_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorContactSignatureType()
      return Frigate_Threat_Response_Coordinator.ContactSignature_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorContactSignatureStatusType(): Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ContactSignatureStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(): Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorContactSignatureStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorContactSignatureStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorContactSignatureStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorContactSignatureStatusType()
      return Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorContactIdentityType(): Frigate_Threat_Response_Coordinator.ContactIdentity.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ContactIdentity.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorContactIdentity_Payload(): Frigate_Threat_Response_Coordinator.ContactIdentity_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorContactIdentity_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorContactIdentity_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactIdentity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorContactIdentity_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorContactIdentityType()
      return Frigate_Threat_Response_Coordinator.ContactIdentity_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorIdentityStatusType(): Frigate_Threat_Response_Coordinator.IdentityStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.IdentityStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(): Frigate_Threat_Response_Coordinator.IdentityStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorIdentityStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorIdentityStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.IdentityStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorIdentityStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorIdentityStatusType()
      return Frigate_Threat_Response_Coordinator.IdentityStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorQualifiedThreatType(): Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.QualifiedThreat.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      return Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(): Frigate_Threat_Response_Coordinator.DefenseAvailability.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseAvailability.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(): Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseAvailability_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAvailability_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseAvailability_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseAvailabilityType()
      return Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType()
      return Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDroneReadinessType(): Frigate_Threat_Response_Coordinator.DroneReadiness.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DroneReadiness.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(): Frigate_Threat_Response_Coordinator.DroneReadiness_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDroneReadiness_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDroneReadiness_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DroneReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDroneReadiness_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDroneReadinessType()
      return Frigate_Threat_Response_Coordinator.DroneReadiness_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(): Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DroneReadinessStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(): Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDroneReadinessStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDroneReadinessStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDroneReadinessStatusType()
      return Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseConditionType(): Frigate_Threat_Response_Coordinator.DefenseCondition.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseCondition.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(): Frigate_Threat_Response_Coordinator.DefenseCondition_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseCondition_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseCondition_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseConditionType()
      return Frigate_Threat_Response_Coordinator.DefenseCondition_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDestinationStatusType(): Frigate_Threat_Response_Coordinator.DestinationStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DestinationStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(): Frigate_Threat_Response_Coordinator.DestinationStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDestinationStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDestinationStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DestinationStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDestinationStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDestinationStatusType()
      return Frigate_Threat_Response_Coordinator.DestinationStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType()
      return Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorWarpProgressType(): Frigate_Threat_Response_Coordinator.WarpProgress.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.WarpProgress.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorWarpProgress_Payload(): Frigate_Threat_Response_Coordinator.WarpProgress_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorWarpProgress_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorWarpProgress_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.WarpProgress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorWarpProgress_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorWarpProgressType()
      return Frigate_Threat_Response_Coordinator.WarpProgress_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorWarpProgressStatusType(): Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.WarpProgressStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(): Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorWarpProgressStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorWarpProgressStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorWarpProgressStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorWarpProgressStatusType()
      return Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatConditionType(): Frigate_Threat_Response_Coordinator.RetreatCondition.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.RetreatCondition.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(): Frigate_Threat_Response_Coordinator.RetreatCondition_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatCondition_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatCondition_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorRetreatConditionType()
      return Frigate_Threat_Response_Coordinator.RetreatCondition_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponseRequestValueType(): Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ResponseRequestValue.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(): Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponseRequestValue_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseRequestValue_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseRequestValue_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponseRequestValueType()
      return Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorRequestStatusType(): Frigate_Threat_Response_Coordinator.RequestStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.RequestStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorRequestStatus_Payload(): Frigate_Threat_Response_Coordinator.RequestStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorRequestStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRequestStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RequestStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRequestStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorRequestStatusType()
      return Frigate_Threat_Response_Coordinator.RequestStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivationType(): Frigate_Threat_Response_Coordinator.DefenseActivation.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.DefenseActivation.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(): Frigate_Threat_Response_Coordinator.DefenseActivation_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseActivation_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseActivation_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseActivation_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseActivationType()
      return Frigate_Threat_Response_Coordinator.DefenseActivation_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType()
      return Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponseDispositionType(): Frigate_Threat_Response_Coordinator.ResponseDisposition.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ResponseDisposition.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(): Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponseDisposition_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseDisposition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseDisposition_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponseDispositionType()
      return Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(): Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.AcknowledgmentValue.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(): Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorAcknowledgmentValue_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorAcknowledgmentValue_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorAcknowledgmentValueType()
      return Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType()
      return Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorReportPriorityType(): Frigate_Threat_Response_Coordinator.ReportPriority.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ReportPriority.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorReportPriority_Payload(): Frigate_Threat_Response_Coordinator.ReportPriority_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorReportPriority_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorReportPriority_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportPriority_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorReportPriority_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorReportPriorityType()
      return Frigate_Threat_Response_Coordinator.ReportPriority_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponseCommitmentType(): Frigate_Threat_Response_Coordinator.ResponseCommitment.Type = {
      val r = reader.readZ()
      return Frigate_Threat_Response_Coordinator.ResponseCommitment.byOrdinal(r).get
    }

    def readFrigate_Threat_Response_CoordinatorResponseCommitment_Payload(): Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponseCommitment_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseCommitment_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseCommitment_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponseCommitmentType()
      return Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorContactEvidence(): Frigate_Threat_Response_Coordinator.ContactEvidence = {
      val r = readFrigate_Threat_Response_CoordinatorContactEvidenceT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorContactEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorContactEvidence)
      }
      val signature = readFrigate_Threat_Response_CoordinatorContactSignatureType()
      val signatureStatus = readFrigate_Threat_Response_CoordinatorContactSignatureStatusType()
      return Frigate_Threat_Response_Coordinator.ContactEvidence(signature, signatureStatus)
    }

    def readFrigate_Threat_Response_CoordinatorContactEvidence_Payload(): Frigate_Threat_Response_Coordinator.ContactEvidence_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorContactEvidence_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorContactEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorContactEvidence_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorContactEvidence()
      return Frigate_Threat_Response_Coordinator.ContactEvidence_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorIdentificationEvidence(): Frigate_Threat_Response_Coordinator.IdentificationEvidence = {
      val r = readFrigate_Threat_Response_CoordinatorIdentificationEvidenceT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorIdentificationEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.IdentificationEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorIdentificationEvidence)
      }
      val identity = readFrigate_Threat_Response_CoordinatorContactIdentityType()
      val identityStatus = readFrigate_Threat_Response_CoordinatorIdentityStatusType()
      return Frigate_Threat_Response_Coordinator.IdentificationEvidence(identity, identityStatus)
    }

    def readFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(): Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorIdentificationEvidence_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorIdentificationEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorIdentificationEvidence_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      return Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseEvidence(): Frigate_Threat_Response_Coordinator.DefenseEvidence = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseEvidenceT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseEvidence)
      }
      val defenseAvailable = readFrigate_Threat_Response_CoordinatorDefenseAvailabilityType()
      val defenseStatus = readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType()
      val droneReadiness = readFrigate_Threat_Response_CoordinatorDroneReadinessType()
      val droneStatus = readFrigate_Threat_Response_CoordinatorDroneReadinessStatusType()
      return Frigate_Threat_Response_Coordinator.DefenseEvidence(defenseAvailable, defenseStatus, droneReadiness, droneStatus)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(): Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseEvidence_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseEvidence_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorDefenseEvidence()
      return Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidenceT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence)
      }
      val destination = readFrigate_Threat_Response_CoordinatorDestinationStatusType()
      val destinationStatus = readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType()
      val warpProgress = readFrigate_Threat_Response_CoordinatorWarpProgressType()
      val warpStatus = readFrigate_Threat_Response_CoordinatorWarpProgressStatusType()
      return Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence(destination, destinationStatus, warpProgress, warpStatus)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      return Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponseRequest(): Frigate_Threat_Response_Coordinator.ResponseRequest = {
      val r = readFrigate_Threat_Response_CoordinatorResponseRequestT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseRequestT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRequest = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseRequest)
      }
      val request = readFrigate_Threat_Response_CoordinatorResponseRequestValueType()
      val requestStatus = readFrigate_Threat_Response_CoordinatorRequestStatusType()
      return Frigate_Threat_Response_Coordinator.ResponseRequest(request, requestStatus)
    }

    def readFrigate_Threat_Response_CoordinatorResponseRequest_Payload(): Frigate_Threat_Response_Coordinator.ResponseRequest_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponseRequest_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseRequest_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseRequest_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponseRequest()
      return Frigate_Threat_Response_Coordinator.ResponseRequest_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorResponseRecord(): Frigate_Threat_Response_Coordinator.ResponseRecord = {
      val r = readFrigate_Threat_Response_CoordinatorResponseRecordT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseRecordT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRecord = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseRecord)
      }
      val qualifiedThreat = readFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      val disposition = readFrigate_Threat_Response_CoordinatorResponseDispositionType()
      return Frigate_Threat_Response_Coordinator.ResponseRecord(qualifiedThreat, disposition)
    }

    def readFrigate_Threat_Response_CoordinatorResponseRecord_Payload(): Frigate_Threat_Response_Coordinator.ResponseRecord_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorResponseRecord_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorResponseRecord_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRecord_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorResponseRecord_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorResponseRecord()
      return Frigate_Threat_Response_Coordinator.ResponseRecord_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorReportAcknowledgment(): Frigate_Threat_Response_Coordinator.ReportAcknowledgment = {
      val r = readFrigate_Threat_Response_CoordinatorReportAcknowledgmentT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorReportAcknowledgmentT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportAcknowledgment = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorReportAcknowledgment)
      }
      val acknowledgment = readFrigate_Threat_Response_CoordinatorAcknowledgmentValueType()
      val acknowledgmentStatus = readFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType()
      return Frigate_Threat_Response_Coordinator.ReportAcknowledgment(acknowledgment, acknowledgmentStatus)
    }

    def readFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(): Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorReportAcknowledgment_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorReportAcknowledgment_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorReportAcknowledgment_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      return Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload(value)
    }

    def readFrigate_Threat_Response_CoordinatorThreatReport(): Frigate_Threat_Response_Coordinator.ThreatReport = {
      val r = readFrigate_Threat_Response_CoordinatorThreatReportT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatReport)
      }
      val qualifiedThreat = readFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      val disposition = readFrigate_Threat_Response_CoordinatorResponseDispositionType()
      val priority = readFrigate_Threat_Response_CoordinatorReportPriorityType()
      return Frigate_Threat_Response_Coordinator.ThreatReport(qualifiedThreat, disposition, priority)
    }

    def readFrigate_Threat_Response_CoordinatorThreatReport_Payload(): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      val r = readFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatReport_Payload)
      }
      val value = readFrigate_Threat_Response_CoordinatorThreatReport()
      return Frigate_Threat_Response_Coordinator.ThreatReport_Payload(value)
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

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P)
      }
      val api_contactEvidence = readFrigate_Threat_Response_CoordinatorContactEvidence()
      val api_identificationEvidence = readFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(api_contactEvidence, api_identificationEvidence)
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS)
      }
      val api_contactEvidence = readFrigate_Threat_Response_CoordinatorContactEvidence()
      val api_identificationEvidence = readFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(api_contactEvidence, api_identificationEvidence)
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P)
      }
      val api_qualifiedThreat = readFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(api_qualifiedThreat)
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS)
      }
      val api_qualifiedThreat = readFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(api_qualifiedThreat)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P)
      }
      val api_defenseEvidence = readFrigate_Threat_Response_CoordinatorDefenseEvidence()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(api_defenseEvidence)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS)
      }
      val api_defenseEvidence = readFrigate_Threat_Response_CoordinatorDefenseEvidence()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(api_defenseEvidence)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P)
      }
      val api_defenseCondition = readFrigate_Threat_Response_CoordinatorDefenseConditionType()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(api_defenseCondition)
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS)
      }
      val api_defenseCondition = readFrigate_Threat_Response_CoordinatorDefenseConditionType()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(api_defenseCondition)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P)
      }
      val api_retreatNavigationEvidence = readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(api_retreatNavigationEvidence)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS)
      }
      val api_retreatNavigationEvidence = readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(api_retreatNavigationEvidence)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P)
      }
      val api_retreatCondition = readFrigate_Threat_Response_CoordinatorRetreatConditionType()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(api_retreatCondition)
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS)
      }
      val api_retreatCondition = readFrigate_Threat_Response_CoordinatorRetreatConditionType()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(api_retreatCondition)
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P)
      }
      val api_defenseCondition = readFrigate_Threat_Response_CoordinatorDefenseConditionType()
      val api_qualifiedThreat = readFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      val api_responseRequest = readFrigate_Threat_Response_CoordinatorResponseRequest()
      val api_retreatCondition = readFrigate_Threat_Response_CoordinatorRetreatConditionType()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(api_defenseCondition, api_qualifiedThreat, api_responseRequest, api_retreatCondition)
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS)
      }
      val In_responseCommitment = readFrigate_Threat_Response_CoordinatorResponseCommitmentType()
      val In_retreatRequestArmed = reader.readB()
      val api_defenseCondition = readFrigate_Threat_Response_CoordinatorDefenseConditionType()
      val api_qualifiedThreat = readFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      val api_responseRequest = readFrigate_Threat_Response_CoordinatorResponseRequest()
      val api_retreatCondition = readFrigate_Threat_Response_CoordinatorRetreatConditionType()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(In_responseCommitment, In_retreatRequestArmed, api_defenseCondition, api_qualifiedThreat, api_responseRequest, api_retreatCondition)
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P)
      }
      val api_defenseActivation = readFrigate_Threat_Response_CoordinatorDefenseActivationType()
      val api_responseRecord = readFrigate_Threat_Response_CoordinatorResponseRecord()
      val api_retreatNavigationCommand = readFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(api_defenseActivation, api_responseRecord, api_retreatNavigationCommand)
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS)
      }
      val responseCommitment = readFrigate_Threat_Response_CoordinatorResponseCommitmentType()
      val retreatRequestArmed = reader.readB()
      val api_defenseActivation = readFrigate_Threat_Response_CoordinatorDefenseActivationType()
      val api_responseRecord = readFrigate_Threat_Response_CoordinatorResponseRecord()
      val api_retreatNavigationCommand = readFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(responseCommitment, retreatRequestArmed, api_defenseActivation, api_responseRecord, api_retreatNavigationCommand)
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P)
      }
      val api_reportAcknowledgment = readFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      val api_responseRecord = readFrigate_Threat_Response_CoordinatorResponseRecord()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(api_reportAcknowledgment, api_responseRecord)
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS)
      }
      val api_reportAcknowledgment = readFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      val api_responseRecord = readFrigate_Threat_Response_CoordinatorResponseRecord()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(api_reportAcknowledgment, api_responseRecord)
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container.")
          val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T)
          return r
      }
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P = {
      val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P)
      }
      val api_threatReport = readFrigate_Threat_Response_CoordinatorThreatReport()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(api_threatReport)
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS = {
      val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(F)
      return r
    }

    def readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS)
      }
      val api_threatReport = readFrigate_Threat_Response_CoordinatorThreatReport()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(api_threatReport)
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
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T)
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
        case Constants.Frigate_Threat_Response_CoordinatorWarpProgress_Payload => val r = readFrigate_Threat_Response_CoordinatorWarpProgress_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReport_Payload => val r = readFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRequestStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorRequestStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorIdentityStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorIdentityStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDroneReadiness_Payload => val r = readFrigate_Threat_Response_CoordinatorDroneReadiness_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportPriority_Payload => val r = readFrigate_Threat_Response_CoordinatorReportPriority_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseRecord_Payload => val r = readFrigate_Threat_Response_CoordinatorResponseRecord_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorContactIdentity_Payload => val r = readFrigate_Threat_Response_CoordinatorContactIdentity_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload => val r = readFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseRequest_Payload => val r = readFrigate_Threat_Response_CoordinatorResponseRequest_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorContactEvidence_Payload => val r = readFrigate_Threat_Response_CoordinatorContactEvidence_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseEvidence_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseEvidence_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorContactSignature_Payload => val r = readFrigate_Threat_Response_CoordinatorContactSignature_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseCondition_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseCondition_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatCondition_Payload => val r = readFrigate_Threat_Response_CoordinatorRetreatCondition_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDestinationStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorDestinationStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseActivation_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseActivation_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorWarpProgressStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorWarpProgressStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseCommitment_Payload => val r = readFrigate_Threat_Response_CoordinatorResponseCommitment_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseAvailability_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseAvailability_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload => val r = readFrigate_Threat_Response_CoordinatorAcknowledgmentValue_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseDisposition_Payload => val r = readFrigate_Threat_Response_CoordinatorResponseDisposition_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorDroneReadinessStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorResponseRequestValue_Payload => val r = readFrigate_Threat_Response_CoordinatorResponseRequestValue_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorReportAcknowledgment_Payload => val r = readFrigate_Threat_Response_CoordinatorReportAcknowledgment_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorContactSignatureStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorContactSignatureStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorIdentificationEvidence_Payload => val r = readFrigate_Threat_Response_CoordinatorIdentificationEvidence_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload => val r = readFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload => val r = readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload => val r = readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_PayloadT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(T); return r
        case Constants.Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T)
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

  def fromFrigate_Threat_Response_CoordinatorContactSignature_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignature_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorContactSignature_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorContactSignature_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ContactSignature_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactSignature_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ContactSignature_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorContactSignature_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorContactSignature_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorContactIdentity_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ContactIdentity_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactIdentity_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ContactIdentity_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorContactIdentity_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorContactIdentity_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.IdentityStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.IdentityStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorIdentityStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorIdentityStatus_Payload _)
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

  def fromFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DroneReadiness_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DroneReadiness_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDroneReadiness_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDroneReadiness_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseCondition_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseCondition_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseCondition_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DestinationStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DestinationStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDestinationStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDestinationStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorWarpProgress_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.WarpProgress_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorWarpProgress_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.WarpProgress_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorWarpProgress_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorWarpProgress_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatCondition_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatCondition_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatCondition_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o: Frigate_Threat_Response_Coordinator.RequestStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRequestStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RequestStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRequestStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.RequestStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRequestStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRequestStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseActivation_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseActivation_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseActivation_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseActivation_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseDisposition_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseDisposition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportPriority_Payload(o: Frigate_Threat_Response_Coordinator.ReportPriority_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportPriority_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportPriority_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportPriority_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportPriority_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ReportPriority_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportPriority_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportPriority_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCommitment_Payload(o: Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseCommitment_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseCommitment_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCommitment_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseCommitment_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseCommitment_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactEvidence(o: Frigate_Threat_Response_Coordinator.ContactEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorContactEvidence(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorContactEvidence(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ContactEvidence, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactEvidence(reader: Reader): Frigate_Threat_Response_Coordinator.ContactEvidence = {
      val r = reader.readFrigate_Threat_Response_CoordinatorContactEvidence()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorContactEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorContactEvidence_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ContactEvidence_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactEvidence_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ContactEvidence_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorContactEvidence_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorContactEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorIdentificationEvidence(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorIdentificationEvidence(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorIdentificationEvidence(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.IdentificationEvidence, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorIdentificationEvidence(reader: Reader): Frigate_Threat_Response_Coordinator.IdentificationEvidence = {
      val r = reader.readFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorIdentificationEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseEvidence(o: Frigate_Threat_Response_Coordinator.DefenseEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseEvidence(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseEvidence(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseEvidence, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseEvidence(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseEvidence = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseEvidence()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRequest(o: Frigate_Threat_Response_Coordinator.ResponseRequest, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseRequest(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseRequest(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseRequest, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRequest(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseRequest = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseRequest()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseRequest _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseRequest_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseRequest_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRequest_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseRequest_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseRequest_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseRequest_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRecord(o: Frigate_Threat_Response_Coordinator.ResponseRecord, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseRecord(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseRecord(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseRecord, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRecord(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseRecord = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseRecord()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseRecord _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorResponseRecord_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ResponseRecord_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRecord_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ResponseRecord_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorResponseRecord_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorResponseRecord_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportAcknowledgment(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportAcknowledgment(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportAcknowledgment(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportAcknowledgment, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportAcknowledgment(reader: Reader): Frigate_Threat_Response_Coordinator.ReportAcknowledgment = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportAcknowledgment _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(reader: Reader): Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload = {
      val r = reader.readFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReport(o: Frigate_Threat_Response_Coordinator.ThreatReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReport(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReport(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReport, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReport(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReport = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReport()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReport _)
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

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
    return w.result
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(data: ISZ[U8]): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(reader: Reader): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS = {
      val r = reader.readFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS()
      return r
    }
    val r = to(data, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS _)
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