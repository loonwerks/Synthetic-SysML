// #Sireum
// @formatter:off

// This file is auto-generated from BatteryCapacityBand.scala, BatteryCheck.scala, BatteryAssessment.scala, SortieContext.scala, SortieQualification.scala, CameraCondition.scala, CaptureResult.scala, CameraEvidence.scala, RadioCondition.scala, DeliveryResult.scala, RadioEvidence.scala, ObservationSessionState.scala, SessionProposal.scala, ObservationIntent.scala, SessionDecision.scala, SnapshotPreSessionState.scala, SnapshotNextSessionState.scala, SnapshotCoordinationDisposition.scala, SnapshotCoordinationReason.scala, CameraAcquisitionCommand.scala, RadioDeliveryCommand.scala, StatusSessionState.scala, StatusCoordinationDisposition.scala, StatusCoordinationReason.scala, OperatorAdvisory.scala, DroneControlObservationNotice.scala, SessionSnapshot.scala, OperatorCoordinationStatus.scala, Base_Types.scala, BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_Containers.scala, SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_Containers.scala, CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_Containers.scala, RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_Containers.scala, SessionProposalOwner_coordinatorProcess_sessionProposalOwner_Containers.scala, ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_Containers.scala, ObservationSessionController_coordinatorProcess_observationSessionController_Containers.scala, CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package observation_acquisition_radio_delivery_coordinator

import org.sireum._

object MsgPack {

  object Constants {

    val Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload: Z = -32

    val Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload: Z = -31

    val Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload: Z = -30

    val Observation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload: Z = -29

    val Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload: Z = -28

    val Observation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload: Z = -27

    val Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload: Z = -26

    val Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload: Z = -25

    val Observation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload: Z = -24

    val Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload: Z = -23

    val Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload: Z = -22

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload: Z = -21

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload: Z = -20

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload: Z = -19

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload: Z = -18

    val Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload: Z = -17

    val Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload: Z = -16

    val Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload: Z = -15

    val Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload: Z = -14

    val Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload: Z = -13

    val Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload: Z = -12

    val Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload: Z = -11

    val Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload: Z = -10

    val Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload: Z = -9

    val Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload: Z = -8

    val Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload: Z = -7

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot: Z = -6

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload: Z = -5

    val Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus: Z = -4

    val Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload: Z = -3

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

    val Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P: Z = 14

    val Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS: Z = 15

    val Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P: Z = 16

    val Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS: Z = 17

    val Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P: Z = 18

    val Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS: Z = 19

    val Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P: Z = 20

    val Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS: Z = 21

    val Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P: Z = 22

    val Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS: Z = 23

    val Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P: Z = 24

    val Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS: Z = 25

    val Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P: Z = 26

    val Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS: Z = 27

    val Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P: Z = 28

    val Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS: Z = 29

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P: Z = 30

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS: Z = 31

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P: Z = 32

    val Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS: Z = 33

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P: Z = 34

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS: Z = 35

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P: Z = 36

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS: Z = 37

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P: Z = 38

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS: Z = 39

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P: Z = 40

    val Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS: Z = 41

    val Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P: Z = 42

    val Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS: Z = 43

    val Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P: Z = 44

    val Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS: Z = 45

    val utilEmptyContainer: Z = 46

    val _artEmpty: Z = 47

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(o.preSession)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(o.nextSession)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(o.disposition)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(o.reason)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.value)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(o.nextSession)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.batteryAssessment)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(o.disposition)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(o.reason)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(o.advisory)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o.value)
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

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o.api_batteryCapacity)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o.api_batteryCheck)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o.api_batteryCapacity)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o.api_batteryCheck)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o.api_sortieContext)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o.api_sortieContext)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o.api_cameraCondition)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o.api_captureResult)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o.api_cameraCondition)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o.api_captureResult)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o.api_deliveryResult)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o.api_radioCondition)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o.api_deliveryResult)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o.api_radioCondition)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseInput)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseInput)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o.api_observationIntent)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o.api_observationIntent)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.In_committedSession)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o.api_cameraAcquisitionCommand)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o.api_radioDeliveryCommand)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseOutput)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.committedSession)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o.api_cameraAcquisitionCommand)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o.api_radioDeliveryCommand)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseOutput)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container): Unit = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
      }
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o.api_droneControlObservationNotice)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o.api_operatorCoordinationStatus)
    }

    def writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o.api_droneControlObservationNotice)
      writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o.api_operatorCoordinationStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
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
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload => writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
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

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type = {
      val r = reader.readZ()
      return Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.byOrdinal(r).get
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshotT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshotT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot)
      }
      val preSession = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType()
      val nextSession = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType()
      val disposition = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType()
      val reason = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot(preSession, nextSession, disposition, reason)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload(value)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatusT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatusT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus)
      }
      val nextSession = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType()
      val batteryAssessment = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      val disposition = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType()
      val reason = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType()
      val advisory = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus(nextSession, batteryAssessment, disposition, reason, advisory)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_PayloadT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload)
      }
      val value = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload(value)
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

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P)
      }
      val api_batteryCapacity = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType()
      val api_batteryCheck = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS)
      }
      val api_batteryCapacity = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType()
      val api_batteryCheck = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P)
      }
      val api_batteryAssessment = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(api_batteryAssessment)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS)
      }
      val api_batteryAssessment = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_batteryAssessment)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P)
      }
      val api_batteryAssessment = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      val api_sortieContext = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(api_batteryAssessment, api_sortieContext)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS)
      }
      val api_batteryAssessment = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      val api_sortieContext = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(api_batteryAssessment, api_sortieContext)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P)
      }
      val api_sortieQualification = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(api_sortieQualification)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS)
      }
      val api_sortieQualification = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(api_sortieQualification)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P)
      }
      val api_cameraCondition = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType()
      val api_captureResult = readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(api_cameraCondition, api_captureResult)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS)
      }
      val api_cameraCondition = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType()
      val api_captureResult = readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(api_cameraCondition, api_captureResult)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P)
      }
      val api_cameraEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(api_cameraEvidence)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS)
      }
      val api_cameraEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(api_cameraEvidence)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P)
      }
      val api_deliveryResult = readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType()
      val api_radioCondition = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(api_deliveryResult, api_radioCondition)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS)
      }
      val api_deliveryResult = readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType()
      val api_radioCondition = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(api_deliveryResult, api_radioCondition)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P)
      }
      val api_radioEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(api_radioEvidence)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS)
      }
      val api_radioEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(api_radioEvidence)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P)
      }
      val api_cameraEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      val api_radioEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      val api_sessionPhaseInput = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      val api_sortieQualification = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(api_cameraEvidence, api_radioEvidence, api_sessionPhaseInput, api_sortieQualification)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS)
      }
      val api_cameraEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      val api_radioEvidence = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      val api_sessionPhaseInput = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      val api_sortieQualification = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(api_cameraEvidence, api_radioEvidence, api_sessionPhaseInput, api_sortieQualification)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P)
      }
      val api_sessionProposal = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(api_sessionProposal)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS)
      }
      val api_sessionProposal = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(api_sessionProposal)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P)
      }
      val api_observationIntent = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType()
      val api_sessionProposal = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(api_observationIntent, api_sessionProposal)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS)
      }
      val api_observationIntent = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType()
      val api_sessionProposal = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(api_observationIntent, api_sessionProposal)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P)
      }
      val api_sessionDecision = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(api_sessionDecision)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS)
      }
      val api_sessionDecision = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(api_sessionDecision)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P)
      }
      val api_sessionDecision = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(api_sessionDecision)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS)
      }
      val In_committedSession = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      val api_sessionDecision = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(In_committedSession, api_sessionDecision)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P)
      }
      val api_cameraAcquisitionCommand = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType()
      val api_radioDeliveryCommand = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType()
      val api_sessionPhaseOutput = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      val api_sessionSnapshot = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(api_cameraAcquisitionCommand, api_radioDeliveryCommand, api_sessionPhaseOutput, api_sessionSnapshot)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS)
      }
      val committedSession = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      val api_cameraAcquisitionCommand = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType()
      val api_radioDeliveryCommand = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType()
      val api_sessionPhaseOutput = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      val api_sessionSnapshot = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(committedSession, api_cameraAcquisitionCommand, api_radioDeliveryCommand, api_sessionPhaseOutput, api_sessionSnapshot)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P)
      }
      val api_batteryAssessment = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      val api_sessionSnapshot = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(api_batteryAssessment, api_sessionSnapshot)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS)
      }
      val api_batteryAssessment = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      val api_sessionSnapshot = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(api_batteryAssessment, api_sessionSnapshot)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P)
      }
      val api_droneControlObservationNotice = readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType()
      val api_operatorCoordinationStatus = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(api_droneControlObservationNotice, api_operatorCoordinationStatus)
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS = {
      val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(F)
      return r
    }

    def readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS)
      }
      val api_droneControlObservationNotice = readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType()
      val api_operatorCoordinationStatus = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(api_droneControlObservationNotice, api_operatorCoordinationStatus)
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
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T)
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
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_PayloadT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T); return r
        case Constants.Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T)
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

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload _)
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

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(reader: Reader): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS = {
      val r = reader.readObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS _)
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