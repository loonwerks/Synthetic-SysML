// #Sireum
// @formatter:off

// This file is auto-generated from BeltObservation.scala, BeltQualification.scala, CalibrationObservation.scala, CalibrationQualification.scala, AcquisitionObservation.scala, PreparationState.scala, MonitoringState.scala, EligibilityEnvelopeCondition.scala, EligibilityEnvelopeRecovery.scala, EligibilityEnvelopePreparationState.scala, EligibilityEnvelopeMonitoringState.scala, DoctorRequest.scala, TechnicianRequest.scala, ArbitrationDecisionEffectiveIntent.scala, ArbitrationDecisionDisposition.scala, PreparationDecisionPreState.scala, PreparationDecisionNextState.scala, PreparationDecisionIntent.scala, PreparationDecisionDisposition.scala, MonitoringDecisionPreState.scala, MonitoringDecisionNextState.scala, MonitoringDecisionIntent.scala, MonitoringDecisionDisposition.scala, MonitoringDecisionNotice.scala, MonitoringDecisionPreparationState.scala, AcquisitionCommand.scala, ImpedanceFrameObservation.scala, FrameDelivery.scala, SessionStatusPreparationState.scala, SessionStatusMonitoringState.scala, SessionStatusDisposition.scala, SessionStatusNotice.scala, BeltAssessment.scala, EligibilityEnvelope.scala, ArbitrationDecision.scala, PreparationDecisionSnapshot.scala, MonitoringDecisionSnapshot.scala, SessionStatus.scala, Base_Types.scala, BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Containers.scala, CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_Containers.scala, AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_Containers.scala, RequestArbiter_acquisitionCoordinationProcess_requestArbiter_Containers.scala, PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_Containers.scala, MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_Containers.scala, AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_Containers.scala, SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val EIT_Acquisition_Session_CoordinatorBeltObservation_Payload: Z = -32

    val EIT_Acquisition_Session_CoordinatorBeltQualification_Payload: Z = -31

    val EIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload: Z = -30

    val EIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload: Z = -29

    val EIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload: Z = -28

    val EIT_Acquisition_Session_CoordinatorPreparationState_Payload: Z = -27

    val EIT_Acquisition_Session_CoordinatorMonitoringState_Payload: Z = -26

    val EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload: Z = -25

    val EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload: Z = -24

    val EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload: Z = -23

    val EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload: Z = -22

    val EIT_Acquisition_Session_CoordinatorDoctorRequest_Payload: Z = -21

    val EIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload: Z = -20

    val EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload: Z = -19

    val EIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload: Z = -18

    val EIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload: Z = -17

    val EIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload: Z = -16

    val EIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload: Z = -15

    val EIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload: Z = -14

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload: Z = -13

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload: Z = -12

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload: Z = -11

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload: Z = -10

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload: Z = -9

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload: Z = -8

    val EIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload: Z = -7

    val EIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload: Z = -6

    val EIT_Acquisition_Session_CoordinatorFrameDelivery_Payload: Z = -5

    val EIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload: Z = -4

    val EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload: Z = -3

    val EIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload: Z = -2

    val EIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload: Z = -1

    val EIT_Acquisition_Session_CoordinatorBeltAssessment: Z = 0

    val EIT_Acquisition_Session_CoordinatorBeltAssessment_Payload: Z = 1

    val EIT_Acquisition_Session_CoordinatorEligibilityEnvelope: Z = 2

    val EIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload: Z = 3

    val EIT_Acquisition_Session_CoordinatorArbitrationDecision: Z = 4

    val EIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload: Z = 5

    val EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot: Z = 6

    val EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload: Z = 7

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot: Z = 8

    val EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload: Z = 9

    val EIT_Acquisition_Session_CoordinatorSessionStatus: Z = 10

    val EIT_Acquisition_Session_CoordinatorSessionStatus_Payload: Z = 11

    val Base_TypesBoolean_Payload: Z = 12

    val Base_TypesInteger_Payload: Z = 13

    val Base_TypesInteger_8_Payload: Z = 14

    val Base_TypesInteger_16_Payload: Z = 15

    val Base_TypesInteger_32_Payload: Z = 16

    val Base_TypesInteger_64_Payload: Z = 17

    val Base_TypesUnsigned_8_Payload: Z = 18

    val Base_TypesUnsigned_16_Payload: Z = 19

    val Base_TypesUnsigned_32_Payload: Z = 20

    val Base_TypesUnsigned_64_Payload: Z = 21

    val Base_TypesFloat_Payload: Z = 22

    val Base_TypesFloat_32_Payload: Z = 23

    val Base_TypesFloat_64_Payload: Z = 24

    val Base_TypesCharacter_Payload: Z = 25

    val Base_TypesString_Payload: Z = 26

    val Base_TypesBits_Payload: Z = 27

    val EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P: Z = 28

    val EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS: Z = 29

    val EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P: Z = 30

    val EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS: Z = 31

    val EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P: Z = 32

    val EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS: Z = 33

    val EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P: Z = 34

    val EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS: Z = 35

    val EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P: Z = 36

    val EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS: Z = 37

    val EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P: Z = 38

    val EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS: Z = 39

    val EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P: Z = 40

    val EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS: Z = 41

    val EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P: Z = 42

    val EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS: Z = 43

    val EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P: Z = 44

    val EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS: Z = 45

    val EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P: Z = 46

    val EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS: Z = 47

    val EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P: Z = 48

    val EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS: Z = 49

    val EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P: Z = 50

    val EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS: Z = 51

    val EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P: Z = 52

    val EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS: Z = 53

    val EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P: Z = 54

    val EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS: Z = 55

    val EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P: Z = 56

    val EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS: Z = 57

    val EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P: Z = 58

    val EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS: Z = 59

    val utilEmptyContainer: Z = 60

    val _artEmpty: Z = 61

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeEIT_Acquisition_Session_CoordinatorBeltObservationType(o: EIT_Acquisition_Session_Coordinator.BeltObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltObservation_Payload)
      writeEIT_Acquisition_Session_CoordinatorBeltObservationType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltQualificationType(o: EIT_Acquisition_Session_Coordinator.BeltQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualification_Payload)
      writeEIT_Acquisition_Session_CoordinatorBeltQualificationType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o: EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload)
      writeEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o: EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload)
      writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload)
      writeEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o: EIT_Acquisition_Session_Coordinator.PreparationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationState_Payload)
      writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringState_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorDoctorRequestType(o: EIT_Acquisition_Session_Coordinator.DoctorRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorDoctorRequest_Payload)
      writeEIT_Acquisition_Session_CoordinatorDoctorRequestType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o: EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload)
      writeEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload)
      writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload)
      writeEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o: EIT_Acquisition_Session_Coordinator.FrameDelivery.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorFrameDelivery_Payload)
      writeEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o: EIT_Acquisition_Session_Coordinator.BeltAssessment): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltAssessment)
      writeEIT_Acquisition_Session_CoordinatorBeltQualificationType(o.beltCategory)
      writer.writeB(o.qualified)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltAssessment_Payload)
      writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelope)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(o.condition)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(o.recovery)
      writer.writeB(o.beltQualified)
      writer.writeB(o.calibrationQualified)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(o.preparationState)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(o.monitoringState)
    }

    def writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecision)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(o.effectiveIntent)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(o.disposition)
    }

    def writeEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(o.preState)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(o.nextState)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(o.effectiveIntent)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(o.disposition)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(o.preState)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(o.nextState)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(o.effectiveIntent)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(o.disposition)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(o.notice)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(o.preparationState)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.value)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatus(o: EIT_Acquisition_Session_Coordinator.SessionStatus): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatus)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(o.preparationState)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(o.monitoringState)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(o.disposition)
      writeEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(o.notice)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatus_Payload)
      writeEIT_Acquisition_Session_CoordinatorSessionStatus(o.value)
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

    def writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorBeltObservationType(o.api_beltObservation)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorBeltObservationType(o.api_beltObservation)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)
    }

    def writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)
      writeEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o.api_calibrationObservation)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)
      writeEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o.api_calibrationObservation)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification)
    }

    def writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o.api_acquisitionObservation)
      writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)
      writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification)
      writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState)
      writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o.api_acquisitionObservation)
      writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)
      writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification)
      writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState)
      writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)
    }

    def writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorDoctorRequestType(o.api_doctorRequest)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)
      writeEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o.api_technicianRequest)
    }

    def writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorDoctorRequestType(o.api_doctorRequest)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)
      writeEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o.api_technicianRequest)
    }

    def writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o.In_committedPreparationState)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision)
      writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState)
    }

    def writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o.committedPreparationState)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision)
      writeEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.In_committedMonitoringState)
      writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)
      writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)
      writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)
      writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState)
    }

    def writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.committedMonitoringState)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)
      writeEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand)
    }

    def writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o.api_impedanceFrame)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o.api_impedanceFrame)
      writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P)
      writeEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o.api_frameDelivery)
      writeEIT_Acquisition_Session_CoordinatorSessionStatus(o.api_sessionStatus)
    }

    def writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS)
      writeEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o.api_frameDelivery)
      writeEIT_Acquisition_Session_CoordinatorSessionStatus(o.api_sessionStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
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
        case o: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload => writeEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload => writeEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload => writeEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload => writeEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload => writeEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationState_Payload => writeEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload => writeEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload => writeEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload => writeEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload => writeEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload => writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload => writeEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload => writeEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload => writeEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload => writeEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload => writeEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload => writeEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload => writeEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload => writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload => writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload => writeEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload => writeEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload => writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload => writeEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload => writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload => writeEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload => writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload => writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload => writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload => writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
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

    def readEIT_Acquisition_Session_CoordinatorBeltObservationType(): EIT_Acquisition_Session_Coordinator.BeltObservation.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.BeltObservation.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(): EIT_Acquisition_Session_Coordinator.BeltObservation_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltObservation_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltObservation_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorBeltObservationType()
      return EIT_Acquisition_Session_Coordinator.BeltObservation_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationType(): EIT_Acquisition_Session_Coordinator.BeltQualification.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.BeltQualification.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(): EIT_Acquisition_Session_Coordinator.BeltQualification_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltQualification_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualification_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualification_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorBeltQualificationType()
      return EIT_Acquisition_Session_Coordinator.BeltQualification_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationObservationType(): EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.CalibrationObservation.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(): EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorCalibrationObservation_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorCalibrationObservationType()
      return EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(): EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualification.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(): EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualification_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualification_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(): EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.AcquisitionObservation.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(): EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionObservation_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorAcquisitionObservationType()
      return EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateType(): EIT_Acquisition_Session_Coordinator.PreparationState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.PreparationState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationState_Payload(): EIT_Acquisition_Session_Coordinator.PreparationState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.PreparationState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateType(): EIT_Acquisition_Session_Coordinator.MonitoringState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.MonitoringState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      return EIT_Acquisition_Session_Coordinator.MonitoringState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorDoctorRequestType(): EIT_Acquisition_Session_Coordinator.DoctorRequest.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.DoctorRequest.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(): EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorDoctorRequest_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorDoctorRequest_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorDoctorRequest_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorDoctorRequestType()
      return EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorTechnicianRequestType(): EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.TechnicianRequest.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(): EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorTechnicianRequest_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorTechnicianRequest_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorTechnicianRequestType()
      return EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(): EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommand.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(): EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommand_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommand_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandType()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType()
      return EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorFrameDeliveryType(): EIT_Acquisition_Session_Coordinator.FrameDelivery.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.FrameDelivery.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(): EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorFrameDelivery_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorFrameDelivery_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorFrameDelivery_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorFrameDeliveryType()
      return EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType()
      return EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType()
      return EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(): EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Session_Coordinator.SessionStatusNotice.byOrdinal(r).get
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionStatusNotice_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusNotice_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType()
      return EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorBeltAssessment(): EIT_Acquisition_Session_Coordinator.BeltAssessment = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltAssessmentT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltAssessmentT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltAssessment)
      }
      val beltCategory = readEIT_Acquisition_Session_CoordinatorBeltQualificationType()
      val qualified = reader.readB()
      return EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory, qualified)
    }

    def readEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(): EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltAssessment_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltAssessment_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltAssessment_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      return EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope = {
      val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelope)
      }
      val condition = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType()
      val recovery = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType()
      val beltQualified = reader.readB()
      val calibrationQualified = reader.readB()
      val preparationState = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType()
      val monitoringState = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelope(condition, recovery, beltQualified, calibrationQualified, preparationState, monitoringState)
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecision(): EIT_Acquisition_Session_Coordinator.ArbitrationDecision = {
      val r = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecisionT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecision)
      }
      val effectiveIntent = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType()
      val disposition = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecision(effectiveIntent, disposition)
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(): EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorArbitrationDecision_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorArbitrationDecision_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshotT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshotT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot)
      }
      val preState = readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType()
      val nextState = readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType()
      val effectiveIntent = readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType()
      val disposition = readEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot(preState, nextState, effectiveIntent, disposition)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshotT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshotT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot)
      }
      val preState = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType()
      val nextState = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType()
      val effectiveIntent = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType()
      val disposition = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType()
      val notice = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType()
      val preparationState = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot(preState, nextState, effectiveIntent, disposition, notice, preparationState)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload(value)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatus(): EIT_Acquisition_Session_Coordinator.SessionStatus = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionStatusT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatusT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatus)
      }
      val preparationState = readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType()
      val monitoringState = readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType()
      val disposition = readEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType()
      val notice = readEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType()
      return EIT_Acquisition_Session_Coordinator.SessionStatus(preparationState, monitoringState, disposition, notice)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatus_Payload = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionStatus_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionStatus_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionStatus_Payload)
      }
      val value = readEIT_Acquisition_Session_CoordinatorSessionStatus()
      return EIT_Acquisition_Session_Coordinator.SessionStatus_Payload(value)
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

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P)
      }
      val api_beltObservation = readEIT_Acquisition_Session_CoordinatorBeltObservationType()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(api_beltObservation)
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS)
      }
      val api_beltObservation = readEIT_Acquisition_Session_CoordinatorBeltObservationType()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(api_beltObservation)
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P)
      }
      val api_beltAssessment = readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(api_beltAssessment)
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS)
      }
      val api_beltAssessment = readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(api_beltAssessment)
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P)
      }
      val api_beltAssessment = readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      val api_calibrationObservation = readEIT_Acquisition_Session_CoordinatorCalibrationObservationType()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(api_beltAssessment, api_calibrationObservation)
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS)
      }
      val api_beltAssessment = readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      val api_calibrationObservation = readEIT_Acquisition_Session_CoordinatorCalibrationObservationType()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(api_beltAssessment, api_calibrationObservation)
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P)
      }
      val api_calibrationQualification = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(api_calibrationQualification)
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS)
      }
      val api_calibrationQualification = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(api_calibrationQualification)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P)
      }
      val api_acquisitionObservation = readEIT_Acquisition_Session_CoordinatorAcquisitionObservationType()
      val api_beltAssessment = readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      val api_calibrationQualification = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      val api_monitoringState = readEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      val api_preparationState = readEIT_Acquisition_Session_CoordinatorPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(api_acquisitionObservation, api_beltAssessment, api_calibrationQualification, api_monitoringState, api_preparationState)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS)
      }
      val api_acquisitionObservation = readEIT_Acquisition_Session_CoordinatorAcquisitionObservationType()
      val api_beltAssessment = readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      val api_calibrationQualification = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      val api_monitoringState = readEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      val api_preparationState = readEIT_Acquisition_Session_CoordinatorPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(api_acquisitionObservation, api_beltAssessment, api_calibrationQualification, api_monitoringState, api_preparationState)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P)
      }
      val api_eligibilityEnvelope = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(api_eligibilityEnvelope)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS)
      }
      val api_eligibilityEnvelope = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(api_eligibilityEnvelope)
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P)
      }
      val api_doctorRequest = readEIT_Acquisition_Session_CoordinatorDoctorRequestType()
      val api_eligibilityEnvelope = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      val api_technicianRequest = readEIT_Acquisition_Session_CoordinatorTechnicianRequestType()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(api_doctorRequest, api_eligibilityEnvelope, api_technicianRequest)
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS)
      }
      val api_doctorRequest = readEIT_Acquisition_Session_CoordinatorDoctorRequestType()
      val api_eligibilityEnvelope = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      val api_technicianRequest = readEIT_Acquisition_Session_CoordinatorTechnicianRequestType()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(api_doctorRequest, api_eligibilityEnvelope, api_technicianRequest)
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P)
      }
      val api_arbitrationDecision = readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(api_arbitrationDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS)
      }
      val api_arbitrationDecision = readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(api_arbitrationDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P)
      }
      val api_arbitrationDecision = readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(api_arbitrationDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS)
      }
      val In_committedPreparationState = readEIT_Acquisition_Session_CoordinatorPreparationStateType()
      val api_arbitrationDecision = readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(In_committedPreparationState, api_arbitrationDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P)
      }
      val api_preparationDecision = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      val api_preparationState = readEIT_Acquisition_Session_CoordinatorPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(api_preparationDecision, api_preparationState)
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS)
      }
      val committedPreparationState = readEIT_Acquisition_Session_CoordinatorPreparationStateType()
      val api_preparationDecision = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      val api_preparationState = readEIT_Acquisition_Session_CoordinatorPreparationStateType()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(committedPreparationState, api_preparationDecision, api_preparationState)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P)
      }
      val api_arbitrationDecision = readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      val api_eligibilityEnvelope = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      val api_preparationDecision = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(api_arbitrationDecision, api_eligibilityEnvelope, api_preparationDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS)
      }
      val In_committedMonitoringState = readEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      val api_arbitrationDecision = readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      val api_eligibilityEnvelope = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      val api_preparationDecision = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(In_committedMonitoringState, api_arbitrationDecision, api_eligibilityEnvelope, api_preparationDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P)
      }
      val api_monitoringDecision = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      val api_monitoringState = readEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(api_monitoringDecision, api_monitoringState)
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS)
      }
      val committedMonitoringState = readEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      val api_monitoringDecision = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      val api_monitoringState = readEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(committedMonitoringState, api_monitoringDecision, api_monitoringState)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P)
      }
      val api_monitoringDecision = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(api_monitoringDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS)
      }
      val api_monitoringDecision = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(api_monitoringDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P)
      }
      val api_acquisitionCommand = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandType()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(api_acquisitionCommand)
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS)
      }
      val api_acquisitionCommand = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandType()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(api_acquisitionCommand)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P)
      }
      val api_impedanceFrame = readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType()
      val api_monitoringDecision = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(api_impedanceFrame, api_monitoringDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS)
      }
      val api_impedanceFrame = readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType()
      val api_monitoringDecision = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(api_impedanceFrame, api_monitoringDecision)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container.")
          val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P)
      }
      val api_frameDelivery = readEIT_Acquisition_Session_CoordinatorFrameDeliveryType()
      val api_sessionStatus = readEIT_Acquisition_Session_CoordinatorSessionStatus()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(api_frameDelivery, api_sessionStatus)
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS = {
      val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS)
      }
      val api_frameDelivery = readEIT_Acquisition_Session_CoordinatorFrameDeliveryType()
      val api_sessionStatus = readEIT_Acquisition_Session_CoordinatorSessionStatus()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(api_frameDelivery, api_sessionStatus)
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
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T)
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
        case Constants.EIT_Acquisition_Session_CoordinatorFrameDelivery_Payload => val r = readEIT_Acquisition_Session_CoordinatorFrameDelivery_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorDoctorRequest_Payload => val r = readEIT_Acquisition_Session_CoordinatorDoctorRequest_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionStatus_Payload => val r = readEIT_Acquisition_Session_CoordinatorSessionStatus_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltAssessment_Payload => val r = readEIT_Acquisition_Session_CoordinatorBeltAssessment_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringState_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltObservation_Payload => val r = readEIT_Acquisition_Session_CoordinatorBeltObservation_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationState_Payload => val r = readEIT_Acquisition_Session_CoordinatorPreparationState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualification_Payload => val r = readEIT_Acquisition_Session_CoordinatorBeltQualification_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload => val r = readEIT_Acquisition_Session_CoordinatorTechnicianRequest_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommand_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload => val r = readEIT_Acquisition_Session_CoordinatorSessionStatusNotice_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload => val r = readEIT_Acquisition_Session_CoordinatorArbitrationDecision_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload => val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionObservation_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload => val r = readEIT_Acquisition_Session_CoordinatorCalibrationObservation_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualification_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload => val r = readEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload => val r = readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload => val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload => val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload => val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload => val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload => val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload => val r = readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload => val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload => val r = readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload => val r = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload => val r = readEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload => val r = readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload => val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload => val r = readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload => val r = readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_PayloadT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T)
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

  def fromEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltObservation_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltQualification_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltQualification_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltQualification_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltQualification_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltAssessment(o: EIT_Acquisition_Session_Coordinator.BeltAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltAssessment(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltAssessment(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltAssessment, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltAssessment(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltAssessment = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltAssessment()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltAssessment _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelope, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(reader: Reader): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecision(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorArbitrationDecision(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecision(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecision, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecision(reader: Reader): EIT_Acquisition_Session_Coordinator.ArbitrationDecision = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorArbitrationDecision _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatus(o: EIT_Acquisition_Session_Coordinator.SessionStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionStatus(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatus(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionStatus, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatus(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionStatus = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionStatus()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionStatus _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionStatus_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionStatus_Payload = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionStatus_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionStatus_Payload _)
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

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(reader: Reader): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS _)
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