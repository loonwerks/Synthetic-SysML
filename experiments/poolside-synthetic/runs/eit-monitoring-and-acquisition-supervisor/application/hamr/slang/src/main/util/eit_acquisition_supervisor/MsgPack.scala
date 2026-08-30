// #Sireum
// @formatter:off

// This file is auto-generated from DoctorSignal.scala, RequestClass.scala, PreparationObservation.scala, PreparationFacts.scala, EquipmentObservation.scala, EquipmentFacts.scala, BatchSignal.scala, BatchFacts.scala, ImageFeedback.scala, ImageResultFacts.scala, DominantFault.scala, RecoveryState.scala, RecoveryGate.scala, RecoveryCause.scala, StartFeasibility.scala, SessionState.scala, CycleState.scala, ImageState.scala, RecoveryEvent.scala, Proposal.scala, SelectedAction.scala, SelectedCause.scala, AcquisitionCommand.scala, ImageCommand.scala, PublicMode.scala, ImageDisposition.scala, RequestFactsRecord.scala, FaultSummary.scala, RecoveryFrame.scala, SessionFrame.scala, CycleFrame.scala, ImageFrame.scala, DecisionFrame.scala, ControlFrame.scala, StatusFrame.scala, Base_Types.scala, DoctorRequestQualification_acquisition_process_doctor_request_qualification_Containers.scala, PreparationAssessment_acquisition_process_preparation_assessment_Containers.scala, EquipmentAssessment_acquisition_process_equipment_assessment_Containers.scala, BatchAssessment_acquisition_process_batch_assessment_Containers.scala, ImageResultAssessment_acquisition_process_image_result_assessment_Containers.scala, FaultComposition_acquisition_process_fault_composition_Containers.scala, SessionControl_acquisition_process_session_control_Containers.scala, AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_Containers.scala, ImageAvailabilityControl_acquisition_process_image_availability_control_Containers.scala, RecoveryControl_acquisition_process_recovery_control_Containers.scala, StartFeasibilityOwner_acquisition_process_start_feasibility_Containers.scala, CollectionFeasibilityOwner_acquisition_process_collection_feasibility_Containers.scala, ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_Containers.scala, SupervisoryArbitration_acquisition_process_supervisory_arbitration_Containers.scala, PublicationComposition_acquisition_process_publication_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package eit_acquisition_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val EIT_Acquisition_SupervisorDoctorSignal_Payload: Z = -32

    val EIT_Acquisition_SupervisorRequestClass_Payload: Z = -31

    val EIT_Acquisition_SupervisorPreparationObservation_Payload: Z = -30

    val EIT_Acquisition_SupervisorPreparationFacts_Payload: Z = -29

    val EIT_Acquisition_SupervisorEquipmentObservation_Payload: Z = -28

    val EIT_Acquisition_SupervisorEquipmentFacts_Payload: Z = -27

    val EIT_Acquisition_SupervisorBatchSignal_Payload: Z = -26

    val EIT_Acquisition_SupervisorBatchFacts_Payload: Z = -25

    val EIT_Acquisition_SupervisorImageFeedback_Payload: Z = -24

    val EIT_Acquisition_SupervisorImageResultFacts_Payload: Z = -23

    val EIT_Acquisition_SupervisorDominantFault_Payload: Z = -22

    val EIT_Acquisition_SupervisorRecoveryState_Payload: Z = -21

    val EIT_Acquisition_SupervisorRecoveryGate_Payload: Z = -20

    val EIT_Acquisition_SupervisorRecoveryCause_Payload: Z = -19

    val EIT_Acquisition_SupervisorStartFeasibility_Payload: Z = -18

    val EIT_Acquisition_SupervisorSessionState_Payload: Z = -17

    val EIT_Acquisition_SupervisorCycleState_Payload: Z = -16

    val EIT_Acquisition_SupervisorImageState_Payload: Z = -15

    val EIT_Acquisition_SupervisorRecoveryEvent_Payload: Z = -14

    val EIT_Acquisition_SupervisorProposal_Payload: Z = -13

    val EIT_Acquisition_SupervisorSelectedAction_Payload: Z = -12

    val EIT_Acquisition_SupervisorSelectedCause_Payload: Z = -11

    val EIT_Acquisition_SupervisorAcquisitionCommand_Payload: Z = -10

    val EIT_Acquisition_SupervisorImageCommand_Payload: Z = -9

    val EIT_Acquisition_SupervisorPublicMode_Payload: Z = -8

    val EIT_Acquisition_SupervisorImageDisposition_Payload: Z = -7

    val EIT_Acquisition_SupervisorRequestFactsRecord: Z = -6

    val EIT_Acquisition_SupervisorRequestFactsRecord_Payload: Z = -5

    val EIT_Acquisition_SupervisorFaultSummary: Z = -4

    val EIT_Acquisition_SupervisorFaultSummary_Payload: Z = -3

    val EIT_Acquisition_SupervisorRecoveryFrame: Z = -2

    val EIT_Acquisition_SupervisorRecoveryFrame_Payload: Z = -1

    val EIT_Acquisition_SupervisorSessionFrame: Z = 0

    val EIT_Acquisition_SupervisorSessionFrame_Payload: Z = 1

    val EIT_Acquisition_SupervisorCycleFrame: Z = 2

    val EIT_Acquisition_SupervisorCycleFrame_Payload: Z = 3

    val EIT_Acquisition_SupervisorImageFrame: Z = 4

    val EIT_Acquisition_SupervisorImageFrame_Payload: Z = 5

    val EIT_Acquisition_SupervisorDecisionFrame: Z = 6

    val EIT_Acquisition_SupervisorDecisionFrame_Payload: Z = 7

    val EIT_Acquisition_SupervisorControlFrame: Z = 8

    val EIT_Acquisition_SupervisorControlFrame_Payload: Z = 9

    val EIT_Acquisition_SupervisorStatusFrame: Z = 10

    val EIT_Acquisition_SupervisorStatusFrame_Payload: Z = 11

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

    val EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P: Z = 28

    val EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS: Z = 29

    val EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P: Z = 30

    val EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS: Z = 31

    val EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P: Z = 32

    val EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS: Z = 33

    val EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P: Z = 34

    val EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS: Z = 35

    val EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P: Z = 36

    val EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS: Z = 37

    val EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P: Z = 38

    val EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS: Z = 39

    val EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P: Z = 40

    val EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS: Z = 41

    val EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P: Z = 42

    val EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS: Z = 43

    val EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P: Z = 44

    val EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS: Z = 45

    val EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P: Z = 46

    val EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS: Z = 47

    val EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P: Z = 48

    val EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS: Z = 49

    val EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P: Z = 50

    val EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS: Z = 51

    val EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P: Z = 52

    val EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS: Z = 53

    val EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P: Z = 54

    val EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS: Z = 55

    val EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P: Z = 56

    val EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS: Z = 57

    val EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P: Z = 58

    val EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS: Z = 59

    val EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P: Z = 60

    val EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS: Z = 61

    val EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P: Z = 62

    val EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS: Z = 63

    val EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P: Z = 64

    val EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS: Z = 65

    val EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P: Z = 66

    val EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS: Z = 67

    val EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P: Z = 68

    val EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS: Z = 69

    val EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P: Z = 70

    val EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS: Z = 71

    val EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P: Z = 72

    val EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS: Z = 73

    val EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P: Z = 74

    val EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS: Z = 75

    val EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P: Z = 76

    val EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS: Z = 77

    val EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P: Z = 78

    val EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS: Z = 79

    val EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P: Z = 80

    val EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS: Z = 81

    val EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P: Z = 82

    val EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS: Z = 83

    val EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P: Z = 84

    val EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS: Z = 85

    val EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P: Z = 86

    val EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS: Z = 87

    val utilEmptyContainer: Z = 88

    val _artEmpty: Z = 89

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeEIT_Acquisition_SupervisorDoctorSignalType(o: EIT_Acquisition_Supervisor.DoctorSignal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorDoctorSignal_Payload(o: EIT_Acquisition_Supervisor.DoctorSignal_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDoctorSignal_Payload)
      writeEIT_Acquisition_SupervisorDoctorSignalType(o.value)
    }

    def writeEIT_Acquisition_SupervisorRequestClassType(o: EIT_Acquisition_Supervisor.RequestClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorRequestClass_Payload(o: EIT_Acquisition_Supervisor.RequestClass_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRequestClass_Payload)
      writeEIT_Acquisition_SupervisorRequestClassType(o.value)
    }

    def writeEIT_Acquisition_SupervisorPreparationObservationType(o: EIT_Acquisition_Supervisor.PreparationObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorPreparationObservation_Payload(o: EIT_Acquisition_Supervisor.PreparationObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPreparationObservation_Payload)
      writeEIT_Acquisition_SupervisorPreparationObservationType(o.value)
    }

    def writeEIT_Acquisition_SupervisorPreparationFactsType(o: EIT_Acquisition_Supervisor.PreparationFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorPreparationFacts_Payload(o: EIT_Acquisition_Supervisor.PreparationFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPreparationFacts_Payload)
      writeEIT_Acquisition_SupervisorPreparationFactsType(o.value)
    }

    def writeEIT_Acquisition_SupervisorEquipmentObservationType(o: EIT_Acquisition_Supervisor.EquipmentObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorEquipmentObservation_Payload(o: EIT_Acquisition_Supervisor.EquipmentObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorEquipmentObservation_Payload)
      writeEIT_Acquisition_SupervisorEquipmentObservationType(o.value)
    }

    def writeEIT_Acquisition_SupervisorEquipmentFactsType(o: EIT_Acquisition_Supervisor.EquipmentFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorEquipmentFacts_Payload(o: EIT_Acquisition_Supervisor.EquipmentFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorEquipmentFacts_Payload)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.value)
    }

    def writeEIT_Acquisition_SupervisorBatchSignalType(o: EIT_Acquisition_Supervisor.BatchSignal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorBatchSignal_Payload(o: EIT_Acquisition_Supervisor.BatchSignal_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorBatchSignal_Payload)
      writeEIT_Acquisition_SupervisorBatchSignalType(o.value)
    }

    def writeEIT_Acquisition_SupervisorBatchFactsType(o: EIT_Acquisition_Supervisor.BatchFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorBatchFacts_Payload(o: EIT_Acquisition_Supervisor.BatchFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorBatchFacts_Payload)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.value)
    }

    def writeEIT_Acquisition_SupervisorImageFeedbackType(o: EIT_Acquisition_Supervisor.ImageFeedback.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorImageFeedback_Payload(o: EIT_Acquisition_Supervisor.ImageFeedback_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageFeedback_Payload)
      writeEIT_Acquisition_SupervisorImageFeedbackType(o.value)
    }

    def writeEIT_Acquisition_SupervisorImageResultFactsType(o: EIT_Acquisition_Supervisor.ImageResultFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorImageResultFacts_Payload(o: EIT_Acquisition_Supervisor.ImageResultFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageResultFacts_Payload)
      writeEIT_Acquisition_SupervisorImageResultFactsType(o.value)
    }

    def writeEIT_Acquisition_SupervisorDominantFaultType(o: EIT_Acquisition_Supervisor.DominantFault.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorDominantFault_Payload(o: EIT_Acquisition_Supervisor.DominantFault_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDominantFault_Payload)
      writeEIT_Acquisition_SupervisorDominantFaultType(o.value)
    }

    def writeEIT_Acquisition_SupervisorRecoveryStateType(o: EIT_Acquisition_Supervisor.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorRecoveryState_Payload(o: EIT_Acquisition_Supervisor.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryState_Payload)
      writeEIT_Acquisition_SupervisorRecoveryStateType(o.value)
    }

    def writeEIT_Acquisition_SupervisorRecoveryGateType(o: EIT_Acquisition_Supervisor.RecoveryGate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorRecoveryGate_Payload(o: EIT_Acquisition_Supervisor.RecoveryGate_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryGate_Payload)
      writeEIT_Acquisition_SupervisorRecoveryGateType(o.value)
    }

    def writeEIT_Acquisition_SupervisorRecoveryCauseType(o: EIT_Acquisition_Supervisor.RecoveryCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorRecoveryCause_Payload(o: EIT_Acquisition_Supervisor.RecoveryCause_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryCause_Payload)
      writeEIT_Acquisition_SupervisorRecoveryCauseType(o.value)
    }

    def writeEIT_Acquisition_SupervisorStartFeasibilityType(o: EIT_Acquisition_Supervisor.StartFeasibility.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorStartFeasibility_Payload(o: EIT_Acquisition_Supervisor.StartFeasibility_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorStartFeasibility_Payload)
      writeEIT_Acquisition_SupervisorStartFeasibilityType(o.value)
    }

    def writeEIT_Acquisition_SupervisorSessionStateType(o: EIT_Acquisition_Supervisor.SessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorSessionState_Payload(o: EIT_Acquisition_Supervisor.SessionState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSessionState_Payload)
      writeEIT_Acquisition_SupervisorSessionStateType(o.value)
    }

    def writeEIT_Acquisition_SupervisorCycleStateType(o: EIT_Acquisition_Supervisor.CycleState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorCycleState_Payload(o: EIT_Acquisition_Supervisor.CycleState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorCycleState_Payload)
      writeEIT_Acquisition_SupervisorCycleStateType(o.value)
    }

    def writeEIT_Acquisition_SupervisorImageStateType(o: EIT_Acquisition_Supervisor.ImageState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorImageState_Payload(o: EIT_Acquisition_Supervisor.ImageState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageState_Payload)
      writeEIT_Acquisition_SupervisorImageStateType(o.value)
    }

    def writeEIT_Acquisition_SupervisorRecoveryEventType(o: EIT_Acquisition_Supervisor.RecoveryEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorRecoveryEvent_Payload(o: EIT_Acquisition_Supervisor.RecoveryEvent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryEvent_Payload)
      writeEIT_Acquisition_SupervisorRecoveryEventType(o.value)
    }

    def writeEIT_Acquisition_SupervisorProposalType(o: EIT_Acquisition_Supervisor.Proposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorProposal_Payload(o: EIT_Acquisition_Supervisor.Proposal_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorProposal_Payload)
      writeEIT_Acquisition_SupervisorProposalType(o.value)
    }

    def writeEIT_Acquisition_SupervisorSelectedActionType(o: EIT_Acquisition_Supervisor.SelectedAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorSelectedAction_Payload(o: EIT_Acquisition_Supervisor.SelectedAction_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSelectedAction_Payload)
      writeEIT_Acquisition_SupervisorSelectedActionType(o.value)
    }

    def writeEIT_Acquisition_SupervisorSelectedCauseType(o: EIT_Acquisition_Supervisor.SelectedCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorSelectedCause_Payload(o: EIT_Acquisition_Supervisor.SelectedCause_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSelectedCause_Payload)
      writeEIT_Acquisition_SupervisorSelectedCauseType(o.value)
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCommandType(o: EIT_Acquisition_Supervisor.AcquisitionCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorAcquisitionCommand_Payload)
      writeEIT_Acquisition_SupervisorAcquisitionCommandType(o.value)
    }

    def writeEIT_Acquisition_SupervisorImageCommandType(o: EIT_Acquisition_Supervisor.ImageCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorImageCommand_Payload(o: EIT_Acquisition_Supervisor.ImageCommand_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageCommand_Payload)
      writeEIT_Acquisition_SupervisorImageCommandType(o.value)
    }

    def writeEIT_Acquisition_SupervisorPublicModeType(o: EIT_Acquisition_Supervisor.PublicMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorPublicMode_Payload(o: EIT_Acquisition_Supervisor.PublicMode_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPublicMode_Payload)
      writeEIT_Acquisition_SupervisorPublicModeType(o.value)
    }

    def writeEIT_Acquisition_SupervisorImageDispositionType(o: EIT_Acquisition_Supervisor.ImageDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_SupervisorImageDisposition_Payload(o: EIT_Acquisition_Supervisor.ImageDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageDisposition_Payload)
      writeEIT_Acquisition_SupervisorImageDispositionType(o.value)
    }

    def writeEIT_Acquisition_SupervisorRequestFactsRecord(o: EIT_Acquisition_Supervisor.RequestFactsRecord): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRequestFactsRecord)
      writeEIT_Acquisition_SupervisorRequestClassType(o.requestClass)
      writer.writeB(o.requestFault)
    }

    def writeEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRequestFactsRecord_Payload)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.value)
    }

    def writeEIT_Acquisition_SupervisorFaultSummary(o: EIT_Acquisition_Supervisor.FaultSummary): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorFaultSummary)
      writer.writeB(o.faultPresent)
      writeEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)
      writer.writeB(o.multipleFaults)
    }

    def writeEIT_Acquisition_SupervisorFaultSummary_Payload(o: EIT_Acquisition_Supervisor.FaultSummary_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorFaultSummary_Payload)
      writeEIT_Acquisition_SupervisorFaultSummary(o.value)
    }

    def writeEIT_Acquisition_SupervisorRecoveryFrame(o: EIT_Acquisition_Supervisor.RecoveryFrame): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryFrame)
      writeEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)
      writeEIT_Acquisition_SupervisorRecoveryStateType(o.recoveryState)
      writeEIT_Acquisition_SupervisorRecoveryGateType(o.recoveryGate)
      writeEIT_Acquisition_SupervisorRecoveryCauseType(o.recoveryCause)
      writer.writeB(o.effectiveFaultPresent)
      writer.writeB(o.effectiveMultipleFaults)
    }

    def writeEIT_Acquisition_SupervisorRecoveryFrame_Payload(o: EIT_Acquisition_Supervisor.RecoveryFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryFrame_Payload)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.value)
    }

    def writeEIT_Acquisition_SupervisorSessionFrame(o: EIT_Acquisition_Supervisor.SessionFrame): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSessionFrame)
      writeEIT_Acquisition_SupervisorSessionStateType(o.sessionState)
      writer.writeB(o.startAdmitted)
      writer.writeB(o.stopAdmitted)
    }

    def writeEIT_Acquisition_SupervisorSessionFrame_Payload(o: EIT_Acquisition_Supervisor.SessionFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSessionFrame_Payload)
      writeEIT_Acquisition_SupervisorSessionFrame(o.value)
    }

    def writeEIT_Acquisition_SupervisorCycleFrame(o: EIT_Acquisition_Supervisor.CycleFrame): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorCycleFrame)
      writeEIT_Acquisition_SupervisorCycleStateType(o.cycleState)
      writer.writeB(o.batchReady)
    }

    def writeEIT_Acquisition_SupervisorCycleFrame_Payload(o: EIT_Acquisition_Supervisor.CycleFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorCycleFrame_Payload)
      writeEIT_Acquisition_SupervisorCycleFrame(o.value)
    }

    def writeEIT_Acquisition_SupervisorImageFrame(o: EIT_Acquisition_Supervisor.ImageFrame): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageFrame)
      writeEIT_Acquisition_SupervisorImageStateType(o.imageState)
      writer.writeB(o.generateProposal)
    }

    def writeEIT_Acquisition_SupervisorImageFrame_Payload(o: EIT_Acquisition_Supervisor.ImageFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageFrame_Payload)
      writeEIT_Acquisition_SupervisorImageFrame(o.value)
    }

    def writeEIT_Acquisition_SupervisorDecisionFrame(o: EIT_Acquisition_Supervisor.DecisionFrame): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDecisionFrame)
      writeEIT_Acquisition_SupervisorSelectedActionType(o.selectedAction)
      writeEIT_Acquisition_SupervisorSelectedCauseType(o.selectedCause)
      writeEIT_Acquisition_SupervisorSessionStateType(o.sessionState)
      writeEIT_Acquisition_SupervisorCycleStateType(o.cycleState)
      writeEIT_Acquisition_SupervisorImageStateType(o.imageState)
      writeEIT_Acquisition_SupervisorRecoveryStateType(o.recoveryState)
      writer.writeB(o.imageAvailable)
      writer.writeB(o.effectiveFaultPresent)
      writeEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)
      writer.writeB(o.multipleFaults)
      writeEIT_Acquisition_SupervisorRecoveryGateType(o.recoveryGate)
    }

    def writeEIT_Acquisition_SupervisorDecisionFrame_Payload(o: EIT_Acquisition_Supervisor.DecisionFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDecisionFrame_Payload)
      writeEIT_Acquisition_SupervisorDecisionFrame(o.value)
    }

    def writeEIT_Acquisition_SupervisorControlFrame(o: EIT_Acquisition_Supervisor.ControlFrame): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorControlFrame)
      writeEIT_Acquisition_SupervisorAcquisitionCommandType(o.acquisitionCommand)
      writeEIT_Acquisition_SupervisorImageCommandType(o.imageCommand)
    }

    def writeEIT_Acquisition_SupervisorControlFrame_Payload(o: EIT_Acquisition_Supervisor.ControlFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorControlFrame_Payload)
      writeEIT_Acquisition_SupervisorControlFrame(o.value)
    }

    def writeEIT_Acquisition_SupervisorStatusFrame(o: EIT_Acquisition_Supervisor.StatusFrame): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorStatusFrame)
      writeEIT_Acquisition_SupervisorPublicModeType(o.publicMode)
      writeEIT_Acquisition_SupervisorSelectedCauseType(o.selectedCause)
      writeEIT_Acquisition_SupervisorSessionStateType(o.sessionState)
      writeEIT_Acquisition_SupervisorCycleStateType(o.cycleState)
      writeEIT_Acquisition_SupervisorImageStateType(o.imageState)
      writeEIT_Acquisition_SupervisorRecoveryStateType(o.recoveryState)
      writeEIT_Acquisition_SupervisorImageDispositionType(o.imageDisposition)
      writeEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)
      writer.writeB(o.multipleFaults)
    }

    def writeEIT_Acquisition_SupervisorStatusFrame_Payload(o: EIT_Acquisition_Supervisor.StatusFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorStatusFrame_Payload)
      writeEIT_Acquisition_SupervisorStatusFrame(o.value)
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

    def writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P)
      writeEIT_Acquisition_SupervisorDoctorSignalType(o.api_doctor_signal)
    }

    def writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorDoctorSignalType(o.api_doctor_signal)
    }

    def writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P)
      writeEIT_Acquisition_SupervisorPreparationObservationType(o.api_preparation_observation)
    }

    def writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorPreparationObservationType(o.api_preparation_observation)
    }

    def writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P)
      writeEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)
    }

    def writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)
    }

    def writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P)
      writeEIT_Acquisition_SupervisorEquipmentObservationType(o.api_equipment_observation)
    }

    def writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorEquipmentObservationType(o.api_equipment_observation)
    }

    def writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
    }

    def writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
    }

    def writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P)
      writeEIT_Acquisition_SupervisorBatchSignalType(o.api_batch_signal)
    }

    def writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorBatchSignalType(o.api_batch_signal)
    }

    def writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
    }

    def writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
    }

    def writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P)
      writeEIT_Acquisition_SupervisorImageFeedbackType(o.api_image_feedback)
    }

    def writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorImageFeedbackType(o.api_image_feedback)
    }

    def writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P)
      writeEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)
    }

    def writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)
    }

    def writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
      writeEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)
      writeEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
      writeEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)
      writeEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P)
      writeEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
      writeEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility)
    }

    def writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
      writeEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility)
    }

    def writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P)
      writeEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)
    }

    def writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)
    }

    def writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
      writeEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)
      writeEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P)
      writeEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)
    }

    def writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)
    }

    def writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P)
      writeEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary)
      writeEIT_Acquisition_SupervisorRecoveryEventType(o.api_recovery_event)
    }

    def writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary)
      writeEIT_Acquisition_SupervisorRecoveryEventType(o.api_recovery_event)
    }

    def writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
    }

    def writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
    }

    def writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
      writeEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)
      writeEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)
    }

    def writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P)
      writeEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility)
    }

    def writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility)
    }

    def writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P)
      writeEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P)
      writeEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal)
    }

    def writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal)
    }

    def writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P)
      writeEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P)
      writeEIT_Acquisition_SupervisorProposalType(o.api_release_proposal)
    }

    def writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorProposalType(o.api_release_proposal)
    }

    def writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P)
      writeEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal)
      writeEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)
      writeEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorProposalType(o.api_release_proposal)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal)
      writeEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)
      writeEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)
      writeEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)
      writeEIT_Acquisition_SupervisorProposalType(o.api_release_proposal)
      writeEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame)
    }

    def writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P)
      writeEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame)
    }

    def writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame)
    }

    def writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P)
      writeEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame)
    }

    def writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS)
      writeEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame)
    }

    def writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P)
      writeEIT_Acquisition_SupervisorControlFrame(o.api_control_frame)
      writeEIT_Acquisition_SupervisorStatusFrame(o.api_status_frame)
    }

    def writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS)
      writeEIT_Acquisition_SupervisorControlFrame(o.api_control_frame)
      writeEIT_Acquisition_SupervisorStatusFrame(o.api_status_frame)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
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
        case o: EIT_Acquisition_Supervisor.Proposal_Payload => writeEIT_Acquisition_SupervisorProposal_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageState_Payload => writeEIT_Acquisition_SupervisorImageState_Payload(o)
        case o: EIT_Acquisition_Supervisor.CycleState_Payload => writeEIT_Acquisition_SupervisorCycleState_Payload(o)
        case o: EIT_Acquisition_Supervisor.BatchFacts_Payload => writeEIT_Acquisition_SupervisorBatchFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.PublicMode_Payload => writeEIT_Acquisition_SupervisorPublicMode_Payload(o)
        case o: EIT_Acquisition_Supervisor.CycleFrame_Payload => writeEIT_Acquisition_SupervisorCycleFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageFrame_Payload => writeEIT_Acquisition_SupervisorImageFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.BatchSignal_Payload => writeEIT_Acquisition_SupervisorBatchSignal_Payload(o)
        case o: EIT_Acquisition_Supervisor.StatusFrame_Payload => writeEIT_Acquisition_SupervisorStatusFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryGate_Payload => writeEIT_Acquisition_SupervisorRecoveryGate_Payload(o)
        case o: EIT_Acquisition_Supervisor.SessionState_Payload => writeEIT_Acquisition_SupervisorSessionState_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageCommand_Payload => writeEIT_Acquisition_SupervisorImageCommand_Payload(o)
        case o: EIT_Acquisition_Supervisor.RequestClass_Payload => writeEIT_Acquisition_SupervisorRequestClass_Payload(o)
        case o: EIT_Acquisition_Supervisor.DoctorSignal_Payload => writeEIT_Acquisition_SupervisorDoctorSignal_Payload(o)
        case o: EIT_Acquisition_Supervisor.SessionFrame_Payload => writeEIT_Acquisition_SupervisorSessionFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.FaultSummary_Payload => writeEIT_Acquisition_SupervisorFaultSummary_Payload(o)
        case o: EIT_Acquisition_Supervisor.ControlFrame_Payload => writeEIT_Acquisition_SupervisorControlFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryState_Payload => writeEIT_Acquisition_SupervisorRecoveryState_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryEvent_Payload => writeEIT_Acquisition_SupervisorRecoveryEvent_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageFeedback_Payload => writeEIT_Acquisition_SupervisorImageFeedback_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryCause_Payload => writeEIT_Acquisition_SupervisorRecoveryCause_Payload(o)
        case o: EIT_Acquisition_Supervisor.SelectedCause_Payload => writeEIT_Acquisition_SupervisorSelectedCause_Payload(o)
        case o: EIT_Acquisition_Supervisor.DominantFault_Payload => writeEIT_Acquisition_SupervisorDominantFault_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryFrame_Payload => writeEIT_Acquisition_SupervisorRecoveryFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.DecisionFrame_Payload => writeEIT_Acquisition_SupervisorDecisionFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.EquipmentFacts_Payload => writeEIT_Acquisition_SupervisorEquipmentFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.SelectedAction_Payload => writeEIT_Acquisition_SupervisorSelectedAction_Payload(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibility_Payload => writeEIT_Acquisition_SupervisorStartFeasibility_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageDisposition_Payload => writeEIT_Acquisition_SupervisorImageDisposition_Payload(o)
        case o: EIT_Acquisition_Supervisor.PreparationFacts_Payload => writeEIT_Acquisition_SupervisorPreparationFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageResultFacts_Payload => writeEIT_Acquisition_SupervisorImageResultFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload => writeEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o)
        case o: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload => writeEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o)
        case o: EIT_Acquisition_Supervisor.EquipmentObservation_Payload => writeEIT_Acquisition_SupervisorEquipmentObservation_Payload(o)
        case o: EIT_Acquisition_Supervisor.PreparationObservation_Payload => writeEIT_Acquisition_SupervisorPreparationObservation_Payload(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
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

    def readEIT_Acquisition_SupervisorDoctorSignalType(): EIT_Acquisition_Supervisor.DoctorSignal.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.DoctorSignal.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorDoctorSignal_Payload(): EIT_Acquisition_Supervisor.DoctorSignal_Payload = {
      val r = readEIT_Acquisition_SupervisorDoctorSignal_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDoctorSignal_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.DoctorSignal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDoctorSignal_Payload)
      }
      val value = readEIT_Acquisition_SupervisorDoctorSignalType()
      return EIT_Acquisition_Supervisor.DoctorSignal_Payload(value)
    }

    def readEIT_Acquisition_SupervisorRequestClassType(): EIT_Acquisition_Supervisor.RequestClass.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.RequestClass.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorRequestClass_Payload(): EIT_Acquisition_Supervisor.RequestClass_Payload = {
      val r = readEIT_Acquisition_SupervisorRequestClass_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRequestClass_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RequestClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRequestClass_Payload)
      }
      val value = readEIT_Acquisition_SupervisorRequestClassType()
      return EIT_Acquisition_Supervisor.RequestClass_Payload(value)
    }

    def readEIT_Acquisition_SupervisorPreparationObservationType(): EIT_Acquisition_Supervisor.PreparationObservation.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.PreparationObservation.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorPreparationObservation_Payload(): EIT_Acquisition_Supervisor.PreparationObservation_Payload = {
      val r = readEIT_Acquisition_SupervisorPreparationObservation_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPreparationObservation_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPreparationObservation_Payload)
      }
      val value = readEIT_Acquisition_SupervisorPreparationObservationType()
      return EIT_Acquisition_Supervisor.PreparationObservation_Payload(value)
    }

    def readEIT_Acquisition_SupervisorPreparationFactsType(): EIT_Acquisition_Supervisor.PreparationFacts.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.PreparationFacts.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorPreparationFacts_Payload(): EIT_Acquisition_Supervisor.PreparationFacts_Payload = {
      val r = readEIT_Acquisition_SupervisorPreparationFacts_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPreparationFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPreparationFacts_Payload)
      }
      val value = readEIT_Acquisition_SupervisorPreparationFactsType()
      return EIT_Acquisition_Supervisor.PreparationFacts_Payload(value)
    }

    def readEIT_Acquisition_SupervisorEquipmentObservationType(): EIT_Acquisition_Supervisor.EquipmentObservation.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.EquipmentObservation.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorEquipmentObservation_Payload(): EIT_Acquisition_Supervisor.EquipmentObservation_Payload = {
      val r = readEIT_Acquisition_SupervisorEquipmentObservation_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorEquipmentObservation_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorEquipmentObservation_Payload)
      }
      val value = readEIT_Acquisition_SupervisorEquipmentObservationType()
      return EIT_Acquisition_Supervisor.EquipmentObservation_Payload(value)
    }

    def readEIT_Acquisition_SupervisorEquipmentFactsType(): EIT_Acquisition_Supervisor.EquipmentFacts.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.EquipmentFacts.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorEquipmentFacts_Payload(): EIT_Acquisition_Supervisor.EquipmentFacts_Payload = {
      val r = readEIT_Acquisition_SupervisorEquipmentFacts_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorEquipmentFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorEquipmentFacts_Payload)
      }
      val value = readEIT_Acquisition_SupervisorEquipmentFactsType()
      return EIT_Acquisition_Supervisor.EquipmentFacts_Payload(value)
    }

    def readEIT_Acquisition_SupervisorBatchSignalType(): EIT_Acquisition_Supervisor.BatchSignal.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.BatchSignal.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorBatchSignal_Payload(): EIT_Acquisition_Supervisor.BatchSignal_Payload = {
      val r = readEIT_Acquisition_SupervisorBatchSignal_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorBatchSignal_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.BatchSignal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorBatchSignal_Payload)
      }
      val value = readEIT_Acquisition_SupervisorBatchSignalType()
      return EIT_Acquisition_Supervisor.BatchSignal_Payload(value)
    }

    def readEIT_Acquisition_SupervisorBatchFactsType(): EIT_Acquisition_Supervisor.BatchFacts.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.BatchFacts.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorBatchFacts_Payload(): EIT_Acquisition_Supervisor.BatchFacts_Payload = {
      val r = readEIT_Acquisition_SupervisorBatchFacts_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorBatchFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.BatchFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorBatchFacts_Payload)
      }
      val value = readEIT_Acquisition_SupervisorBatchFactsType()
      return EIT_Acquisition_Supervisor.BatchFacts_Payload(value)
    }

    def readEIT_Acquisition_SupervisorImageFeedbackType(): EIT_Acquisition_Supervisor.ImageFeedback.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.ImageFeedback.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorImageFeedback_Payload(): EIT_Acquisition_Supervisor.ImageFeedback_Payload = {
      val r = readEIT_Acquisition_SupervisorImageFeedback_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageFeedback_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageFeedback_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageFeedback_Payload)
      }
      val value = readEIT_Acquisition_SupervisorImageFeedbackType()
      return EIT_Acquisition_Supervisor.ImageFeedback_Payload(value)
    }

    def readEIT_Acquisition_SupervisorImageResultFactsType(): EIT_Acquisition_Supervisor.ImageResultFacts.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.ImageResultFacts.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorImageResultFacts_Payload(): EIT_Acquisition_Supervisor.ImageResultFacts_Payload = {
      val r = readEIT_Acquisition_SupervisorImageResultFacts_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageResultFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageResultFacts_Payload)
      }
      val value = readEIT_Acquisition_SupervisorImageResultFactsType()
      return EIT_Acquisition_Supervisor.ImageResultFacts_Payload(value)
    }

    def readEIT_Acquisition_SupervisorDominantFaultType(): EIT_Acquisition_Supervisor.DominantFault.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.DominantFault.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorDominantFault_Payload(): EIT_Acquisition_Supervisor.DominantFault_Payload = {
      val r = readEIT_Acquisition_SupervisorDominantFault_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDominantFault_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.DominantFault_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDominantFault_Payload)
      }
      val value = readEIT_Acquisition_SupervisorDominantFaultType()
      return EIT_Acquisition_Supervisor.DominantFault_Payload(value)
    }

    def readEIT_Acquisition_SupervisorRecoveryStateType(): EIT_Acquisition_Supervisor.RecoveryState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.RecoveryState.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorRecoveryState_Payload(): EIT_Acquisition_Supervisor.RecoveryState_Payload = {
      val r = readEIT_Acquisition_SupervisorRecoveryState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryState_Payload)
      }
      val value = readEIT_Acquisition_SupervisorRecoveryStateType()
      return EIT_Acquisition_Supervisor.RecoveryState_Payload(value)
    }

    def readEIT_Acquisition_SupervisorRecoveryGateType(): EIT_Acquisition_Supervisor.RecoveryGate.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.RecoveryGate.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorRecoveryGate_Payload(): EIT_Acquisition_Supervisor.RecoveryGate_Payload = {
      val r = readEIT_Acquisition_SupervisorRecoveryGate_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryGate_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryGate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryGate_Payload)
      }
      val value = readEIT_Acquisition_SupervisorRecoveryGateType()
      return EIT_Acquisition_Supervisor.RecoveryGate_Payload(value)
    }

    def readEIT_Acquisition_SupervisorRecoveryCauseType(): EIT_Acquisition_Supervisor.RecoveryCause.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.RecoveryCause.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorRecoveryCause_Payload(): EIT_Acquisition_Supervisor.RecoveryCause_Payload = {
      val r = readEIT_Acquisition_SupervisorRecoveryCause_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryCause_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryCause_Payload)
      }
      val value = readEIT_Acquisition_SupervisorRecoveryCauseType()
      return EIT_Acquisition_Supervisor.RecoveryCause_Payload(value)
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityType(): EIT_Acquisition_Supervisor.StartFeasibility.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.StartFeasibility.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorStartFeasibility_Payload(): EIT_Acquisition_Supervisor.StartFeasibility_Payload = {
      val r = readEIT_Acquisition_SupervisorStartFeasibility_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorStartFeasibility_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorStartFeasibility_Payload)
      }
      val value = readEIT_Acquisition_SupervisorStartFeasibilityType()
      return EIT_Acquisition_Supervisor.StartFeasibility_Payload(value)
    }

    def readEIT_Acquisition_SupervisorSessionStateType(): EIT_Acquisition_Supervisor.SessionState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.SessionState.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorSessionState_Payload(): EIT_Acquisition_Supervisor.SessionState_Payload = {
      val r = readEIT_Acquisition_SupervisorSessionState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSessionState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSessionState_Payload)
      }
      val value = readEIT_Acquisition_SupervisorSessionStateType()
      return EIT_Acquisition_Supervisor.SessionState_Payload(value)
    }

    def readEIT_Acquisition_SupervisorCycleStateType(): EIT_Acquisition_Supervisor.CycleState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.CycleState.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorCycleState_Payload(): EIT_Acquisition_Supervisor.CycleState_Payload = {
      val r = readEIT_Acquisition_SupervisorCycleState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorCycleState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.CycleState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorCycleState_Payload)
      }
      val value = readEIT_Acquisition_SupervisorCycleStateType()
      return EIT_Acquisition_Supervisor.CycleState_Payload(value)
    }

    def readEIT_Acquisition_SupervisorImageStateType(): EIT_Acquisition_Supervisor.ImageState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.ImageState.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorImageState_Payload(): EIT_Acquisition_Supervisor.ImageState_Payload = {
      val r = readEIT_Acquisition_SupervisorImageState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageState_Payload)
      }
      val value = readEIT_Acquisition_SupervisorImageStateType()
      return EIT_Acquisition_Supervisor.ImageState_Payload(value)
    }

    def readEIT_Acquisition_SupervisorRecoveryEventType(): EIT_Acquisition_Supervisor.RecoveryEvent.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.RecoveryEvent.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorRecoveryEvent_Payload(): EIT_Acquisition_Supervisor.RecoveryEvent_Payload = {
      val r = readEIT_Acquisition_SupervisorRecoveryEvent_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryEvent_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryEvent_Payload)
      }
      val value = readEIT_Acquisition_SupervisorRecoveryEventType()
      return EIT_Acquisition_Supervisor.RecoveryEvent_Payload(value)
    }

    def readEIT_Acquisition_SupervisorProposalType(): EIT_Acquisition_Supervisor.Proposal.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.Proposal.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorProposal_Payload(): EIT_Acquisition_Supervisor.Proposal_Payload = {
      val r = readEIT_Acquisition_SupervisorProposal_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorProposal_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.Proposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorProposal_Payload)
      }
      val value = readEIT_Acquisition_SupervisorProposalType()
      return EIT_Acquisition_Supervisor.Proposal_Payload(value)
    }

    def readEIT_Acquisition_SupervisorSelectedActionType(): EIT_Acquisition_Supervisor.SelectedAction.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.SelectedAction.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorSelectedAction_Payload(): EIT_Acquisition_Supervisor.SelectedAction_Payload = {
      val r = readEIT_Acquisition_SupervisorSelectedAction_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSelectedAction_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SelectedAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSelectedAction_Payload)
      }
      val value = readEIT_Acquisition_SupervisorSelectedActionType()
      return EIT_Acquisition_Supervisor.SelectedAction_Payload(value)
    }

    def readEIT_Acquisition_SupervisorSelectedCauseType(): EIT_Acquisition_Supervisor.SelectedCause.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.SelectedCause.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorSelectedCause_Payload(): EIT_Acquisition_Supervisor.SelectedCause_Payload = {
      val r = readEIT_Acquisition_SupervisorSelectedCause_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSelectedCause_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SelectedCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSelectedCause_Payload)
      }
      val value = readEIT_Acquisition_SupervisorSelectedCauseType()
      return EIT_Acquisition_Supervisor.SelectedCause_Payload(value)
    }

    def readEIT_Acquisition_SupervisorAcquisitionCommandType(): EIT_Acquisition_Supervisor.AcquisitionCommand.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.AcquisitionCommand.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorAcquisitionCommand_Payload(): EIT_Acquisition_Supervisor.AcquisitionCommand_Payload = {
      val r = readEIT_Acquisition_SupervisorAcquisitionCommand_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorAcquisitionCommand_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorAcquisitionCommand_Payload)
      }
      val value = readEIT_Acquisition_SupervisorAcquisitionCommandType()
      return EIT_Acquisition_Supervisor.AcquisitionCommand_Payload(value)
    }

    def readEIT_Acquisition_SupervisorImageCommandType(): EIT_Acquisition_Supervisor.ImageCommand.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.ImageCommand.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorImageCommand_Payload(): EIT_Acquisition_Supervisor.ImageCommand_Payload = {
      val r = readEIT_Acquisition_SupervisorImageCommand_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageCommand_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageCommand_Payload)
      }
      val value = readEIT_Acquisition_SupervisorImageCommandType()
      return EIT_Acquisition_Supervisor.ImageCommand_Payload(value)
    }

    def readEIT_Acquisition_SupervisorPublicModeType(): EIT_Acquisition_Supervisor.PublicMode.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.PublicMode.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorPublicMode_Payload(): EIT_Acquisition_Supervisor.PublicMode_Payload = {
      val r = readEIT_Acquisition_SupervisorPublicMode_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPublicMode_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.PublicMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPublicMode_Payload)
      }
      val value = readEIT_Acquisition_SupervisorPublicModeType()
      return EIT_Acquisition_Supervisor.PublicMode_Payload(value)
    }

    def readEIT_Acquisition_SupervisorImageDispositionType(): EIT_Acquisition_Supervisor.ImageDisposition.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Supervisor.ImageDisposition.byOrdinal(r).get
    }

    def readEIT_Acquisition_SupervisorImageDisposition_Payload(): EIT_Acquisition_Supervisor.ImageDisposition_Payload = {
      val r = readEIT_Acquisition_SupervisorImageDisposition_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageDisposition_Payload)
      }
      val value = readEIT_Acquisition_SupervisorImageDispositionType()
      return EIT_Acquisition_Supervisor.ImageDisposition_Payload(value)
    }

    def readEIT_Acquisition_SupervisorRequestFactsRecord(): EIT_Acquisition_Supervisor.RequestFactsRecord = {
      val r = readEIT_Acquisition_SupervisorRequestFactsRecordT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRequestFactsRecordT(typeParsed: B): EIT_Acquisition_Supervisor.RequestFactsRecord = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRequestFactsRecord)
      }
      val requestClass = readEIT_Acquisition_SupervisorRequestClassType()
      val requestFault = reader.readB()
      return EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass, requestFault)
    }

    def readEIT_Acquisition_SupervisorRequestFactsRecord_Payload(): EIT_Acquisition_Supervisor.RequestFactsRecord_Payload = {
      val r = readEIT_Acquisition_SupervisorRequestFactsRecord_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRequestFactsRecord_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RequestFactsRecord_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRequestFactsRecord_Payload)
      }
      val value = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.RequestFactsRecord_Payload(value)
    }

    def readEIT_Acquisition_SupervisorFaultSummary(): EIT_Acquisition_Supervisor.FaultSummary = {
      val r = readEIT_Acquisition_SupervisorFaultSummaryT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorFaultSummaryT(typeParsed: B): EIT_Acquisition_Supervisor.FaultSummary = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorFaultSummary)
      }
      val faultPresent = reader.readB()
      val dominantFault = readEIT_Acquisition_SupervisorDominantFaultType()
      val multipleFaults = reader.readB()
      return EIT_Acquisition_Supervisor.FaultSummary(faultPresent, dominantFault, multipleFaults)
    }

    def readEIT_Acquisition_SupervisorFaultSummary_Payload(): EIT_Acquisition_Supervisor.FaultSummary_Payload = {
      val r = readEIT_Acquisition_SupervisorFaultSummary_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorFaultSummary_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.FaultSummary_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorFaultSummary_Payload)
      }
      val value = readEIT_Acquisition_SupervisorFaultSummary()
      return EIT_Acquisition_Supervisor.FaultSummary_Payload(value)
    }

    def readEIT_Acquisition_SupervisorRecoveryFrame(): EIT_Acquisition_Supervisor.RecoveryFrame = {
      val r = readEIT_Acquisition_SupervisorRecoveryFrameT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryFrameT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryFrame)
      }
      val dominantFault = readEIT_Acquisition_SupervisorDominantFaultType()
      val recoveryState = readEIT_Acquisition_SupervisorRecoveryStateType()
      val recoveryGate = readEIT_Acquisition_SupervisorRecoveryGateType()
      val recoveryCause = readEIT_Acquisition_SupervisorRecoveryCauseType()
      val effectiveFaultPresent = reader.readB()
      val effectiveMultipleFaults = reader.readB()
      return EIT_Acquisition_Supervisor.RecoveryFrame(dominantFault, recoveryState, recoveryGate, recoveryCause, effectiveFaultPresent, effectiveMultipleFaults)
    }

    def readEIT_Acquisition_SupervisorRecoveryFrame_Payload(): EIT_Acquisition_Supervisor.RecoveryFrame_Payload = {
      val r = readEIT_Acquisition_SupervisorRecoveryFrame_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryFrame_Payload)
      }
      val value = readEIT_Acquisition_SupervisorRecoveryFrame()
      return EIT_Acquisition_Supervisor.RecoveryFrame_Payload(value)
    }

    def readEIT_Acquisition_SupervisorSessionFrame(): EIT_Acquisition_Supervisor.SessionFrame = {
      val r = readEIT_Acquisition_SupervisorSessionFrameT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSessionFrameT(typeParsed: B): EIT_Acquisition_Supervisor.SessionFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSessionFrame)
      }
      val sessionState = readEIT_Acquisition_SupervisorSessionStateType()
      val startAdmitted = reader.readB()
      val stopAdmitted = reader.readB()
      return EIT_Acquisition_Supervisor.SessionFrame(sessionState, startAdmitted, stopAdmitted)
    }

    def readEIT_Acquisition_SupervisorSessionFrame_Payload(): EIT_Acquisition_Supervisor.SessionFrame_Payload = {
      val r = readEIT_Acquisition_SupervisorSessionFrame_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSessionFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SessionFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSessionFrame_Payload)
      }
      val value = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.SessionFrame_Payload(value)
    }

    def readEIT_Acquisition_SupervisorCycleFrame(): EIT_Acquisition_Supervisor.CycleFrame = {
      val r = readEIT_Acquisition_SupervisorCycleFrameT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorCycleFrameT(typeParsed: B): EIT_Acquisition_Supervisor.CycleFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorCycleFrame)
      }
      val cycleState = readEIT_Acquisition_SupervisorCycleStateType()
      val batchReady = reader.readB()
      return EIT_Acquisition_Supervisor.CycleFrame(cycleState, batchReady)
    }

    def readEIT_Acquisition_SupervisorCycleFrame_Payload(): EIT_Acquisition_Supervisor.CycleFrame_Payload = {
      val r = readEIT_Acquisition_SupervisorCycleFrame_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorCycleFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.CycleFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorCycleFrame_Payload)
      }
      val value = readEIT_Acquisition_SupervisorCycleFrame()
      return EIT_Acquisition_Supervisor.CycleFrame_Payload(value)
    }

    def readEIT_Acquisition_SupervisorImageFrame(): EIT_Acquisition_Supervisor.ImageFrame = {
      val r = readEIT_Acquisition_SupervisorImageFrameT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageFrameT(typeParsed: B): EIT_Acquisition_Supervisor.ImageFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageFrame)
      }
      val imageState = readEIT_Acquisition_SupervisorImageStateType()
      val generateProposal = reader.readB()
      return EIT_Acquisition_Supervisor.ImageFrame(imageState, generateProposal)
    }

    def readEIT_Acquisition_SupervisorImageFrame_Payload(): EIT_Acquisition_Supervisor.ImageFrame_Payload = {
      val r = readEIT_Acquisition_SupervisorImageFrame_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageFrame_Payload)
      }
      val value = readEIT_Acquisition_SupervisorImageFrame()
      return EIT_Acquisition_Supervisor.ImageFrame_Payload(value)
    }

    def readEIT_Acquisition_SupervisorDecisionFrame(): EIT_Acquisition_Supervisor.DecisionFrame = {
      val r = readEIT_Acquisition_SupervisorDecisionFrameT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDecisionFrameT(typeParsed: B): EIT_Acquisition_Supervisor.DecisionFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDecisionFrame)
      }
      val selectedAction = readEIT_Acquisition_SupervisorSelectedActionType()
      val selectedCause = readEIT_Acquisition_SupervisorSelectedCauseType()
      val sessionState = readEIT_Acquisition_SupervisorSessionStateType()
      val cycleState = readEIT_Acquisition_SupervisorCycleStateType()
      val imageState = readEIT_Acquisition_SupervisorImageStateType()
      val recoveryState = readEIT_Acquisition_SupervisorRecoveryStateType()
      val imageAvailable = reader.readB()
      val effectiveFaultPresent = reader.readB()
      val dominantFault = readEIT_Acquisition_SupervisorDominantFaultType()
      val multipleFaults = reader.readB()
      val recoveryGate = readEIT_Acquisition_SupervisorRecoveryGateType()
      return EIT_Acquisition_Supervisor.DecisionFrame(selectedAction, selectedCause, sessionState, cycleState, imageState, recoveryState, imageAvailable, effectiveFaultPresent, dominantFault, multipleFaults, recoveryGate)
    }

    def readEIT_Acquisition_SupervisorDecisionFrame_Payload(): EIT_Acquisition_Supervisor.DecisionFrame_Payload = {
      val r = readEIT_Acquisition_SupervisorDecisionFrame_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDecisionFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.DecisionFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDecisionFrame_Payload)
      }
      val value = readEIT_Acquisition_SupervisorDecisionFrame()
      return EIT_Acquisition_Supervisor.DecisionFrame_Payload(value)
    }

    def readEIT_Acquisition_SupervisorControlFrame(): EIT_Acquisition_Supervisor.ControlFrame = {
      val r = readEIT_Acquisition_SupervisorControlFrameT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorControlFrameT(typeParsed: B): EIT_Acquisition_Supervisor.ControlFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorControlFrame)
      }
      val acquisitionCommand = readEIT_Acquisition_SupervisorAcquisitionCommandType()
      val imageCommand = readEIT_Acquisition_SupervisorImageCommandType()
      return EIT_Acquisition_Supervisor.ControlFrame(acquisitionCommand, imageCommand)
    }

    def readEIT_Acquisition_SupervisorControlFrame_Payload(): EIT_Acquisition_Supervisor.ControlFrame_Payload = {
      val r = readEIT_Acquisition_SupervisorControlFrame_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorControlFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ControlFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorControlFrame_Payload)
      }
      val value = readEIT_Acquisition_SupervisorControlFrame()
      return EIT_Acquisition_Supervisor.ControlFrame_Payload(value)
    }

    def readEIT_Acquisition_SupervisorStatusFrame(): EIT_Acquisition_Supervisor.StatusFrame = {
      val r = readEIT_Acquisition_SupervisorStatusFrameT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorStatusFrameT(typeParsed: B): EIT_Acquisition_Supervisor.StatusFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorStatusFrame)
      }
      val publicMode = readEIT_Acquisition_SupervisorPublicModeType()
      val selectedCause = readEIT_Acquisition_SupervisorSelectedCauseType()
      val sessionState = readEIT_Acquisition_SupervisorSessionStateType()
      val cycleState = readEIT_Acquisition_SupervisorCycleStateType()
      val imageState = readEIT_Acquisition_SupervisorImageStateType()
      val recoveryState = readEIT_Acquisition_SupervisorRecoveryStateType()
      val imageDisposition = readEIT_Acquisition_SupervisorImageDispositionType()
      val dominantFault = readEIT_Acquisition_SupervisorDominantFaultType()
      val multipleFaults = reader.readB()
      return EIT_Acquisition_Supervisor.StatusFrame(publicMode, selectedCause, sessionState, cycleState, imageState, recoveryState, imageDisposition, dominantFault, multipleFaults)
    }

    def readEIT_Acquisition_SupervisorStatusFrame_Payload(): EIT_Acquisition_Supervisor.StatusFrame_Payload = {
      val r = readEIT_Acquisition_SupervisorStatusFrame_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorStatusFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.StatusFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorStatusFrame_Payload)
      }
      val value = readEIT_Acquisition_SupervisorStatusFrame()
      return EIT_Acquisition_Supervisor.StatusFrame_Payload(value)
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

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P)
      }
      val api_doctor_signal = readEIT_Acquisition_SupervisorDoctorSignalType()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(api_doctor_signal)
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS)
      }
      val api_doctor_signal = readEIT_Acquisition_SupervisorDoctorSignalType()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(api_doctor_signal)
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P)
      }
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(api_request_facts)
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS)
      }
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(api_request_facts)
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P)
      }
      val api_preparation_observation = readEIT_Acquisition_SupervisorPreparationObservationType()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(api_preparation_observation)
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS)
      }
      val api_preparation_observation = readEIT_Acquisition_SupervisorPreparationObservationType()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(api_preparation_observation)
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P)
      }
      val api_preparation_facts = readEIT_Acquisition_SupervisorPreparationFactsType()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(api_preparation_facts)
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS)
      }
      val api_preparation_facts = readEIT_Acquisition_SupervisorPreparationFactsType()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(api_preparation_facts)
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P)
      }
      val api_equipment_observation = readEIT_Acquisition_SupervisorEquipmentObservationType()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(api_equipment_observation)
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS)
      }
      val api_equipment_observation = readEIT_Acquisition_SupervisorEquipmentObservationType()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(api_equipment_observation)
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P)
      }
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(api_equipment_facts)
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS)
      }
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(api_equipment_facts)
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P)
      }
      val api_batch_signal = readEIT_Acquisition_SupervisorBatchSignalType()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(api_batch_signal)
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS)
      }
      val api_batch_signal = readEIT_Acquisition_SupervisorBatchSignalType()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(api_batch_signal)
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(api_batch_facts)
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(api_batch_facts)
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P)
      }
      val api_image_feedback = readEIT_Acquisition_SupervisorImageFeedbackType()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(api_image_feedback)
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS)
      }
      val api_image_feedback = readEIT_Acquisition_SupervisorImageFeedbackType()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(api_image_feedback)
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P)
      }
      val api_image_result_facts = readEIT_Acquisition_SupervisorImageResultFactsType()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(api_image_result_facts)
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS)
      }
      val api_image_result_facts = readEIT_Acquisition_SupervisorImageResultFactsType()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(api_image_result_facts)
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      val api_image_result_facts = readEIT_Acquisition_SupervisorImageResultFactsType()
      val api_preparation_facts = readEIT_Acquisition_SupervisorPreparationFactsType()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P(api_batch_facts, api_equipment_facts, api_image_result_facts, api_preparation_facts, api_request_facts)
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      val api_image_result_facts = readEIT_Acquisition_SupervisorImageResultFactsType()
      val api_preparation_facts = readEIT_Acquisition_SupervisorPreparationFactsType()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS(api_batch_facts, api_equipment_facts, api_image_result_facts, api_preparation_facts, api_request_facts)
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P)
      }
      val api_fault_summary = readEIT_Acquisition_SupervisorFaultSummary()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P(api_fault_summary)
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS)
      }
      val api_fault_summary = readEIT_Acquisition_SupervisorFaultSummary()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS(api_fault_summary)
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P)
      }
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      val api_start_feasibility = readEIT_Acquisition_SupervisorStartFeasibilityType()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P(api_recovery_frame, api_request_facts, api_start_feasibility)
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS)
      }
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      val api_start_feasibility = readEIT_Acquisition_SupervisorStartFeasibilityType()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS(api_recovery_frame, api_request_facts, api_start_feasibility)
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P)
      }
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P(api_session_frame)
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS)
      }
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS(api_session_frame)
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(api_batch_facts, api_equipment_facts, api_recovery_frame)
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(api_batch_facts, api_equipment_facts, api_recovery_frame)
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P)
      }
      val api_cycle_frame = readEIT_Acquisition_SupervisorCycleFrame()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(api_cycle_frame)
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS)
      }
      val api_cycle_frame = readEIT_Acquisition_SupervisorCycleFrame()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(api_cycle_frame)
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      val api_image_result_facts = readEIT_Acquisition_SupervisorImageResultFactsType()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(api_batch_facts, api_image_result_facts, api_recovery_frame, api_request_facts)
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS)
      }
      val api_batch_facts = readEIT_Acquisition_SupervisorBatchFactsType()
      val api_image_result_facts = readEIT_Acquisition_SupervisorImageResultFactsType()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(api_batch_facts, api_image_result_facts, api_recovery_frame, api_request_facts)
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P)
      }
      val api_image_frame = readEIT_Acquisition_SupervisorImageFrame()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(api_image_frame)
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS)
      }
      val api_image_frame = readEIT_Acquisition_SupervisorImageFrame()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(api_image_frame)
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P)
      }
      val api_fault_summary = readEIT_Acquisition_SupervisorFaultSummary()
      val api_recovery_event = readEIT_Acquisition_SupervisorRecoveryEventType()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P(api_fault_summary, api_recovery_event)
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS)
      }
      val api_fault_summary = readEIT_Acquisition_SupervisorFaultSummary()
      val api_recovery_event = readEIT_Acquisition_SupervisorRecoveryEventType()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(api_fault_summary, api_recovery_event)
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P)
      }
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P(api_recovery_frame)
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS)
      }
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(api_recovery_frame)
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P)
      }
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      val api_preparation_facts = readEIT_Acquisition_SupervisorPreparationFactsType()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(api_equipment_facts, api_preparation_facts, api_recovery_frame, api_request_facts)
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS)
      }
      val api_equipment_facts = readEIT_Acquisition_SupervisorEquipmentFactsType()
      val api_preparation_facts = readEIT_Acquisition_SupervisorPreparationFactsType()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_request_facts = readEIT_Acquisition_SupervisorRequestFactsRecord()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(api_equipment_facts, api_preparation_facts, api_recovery_frame, api_request_facts)
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P)
      }
      val api_start_feasibility = readEIT_Acquisition_SupervisorStartFeasibilityType()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(api_start_feasibility)
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS)
      }
      val api_start_feasibility = readEIT_Acquisition_SupervisorStartFeasibilityType()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(api_start_feasibility)
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P)
      }
      val api_cycle_frame = readEIT_Acquisition_SupervisorCycleFrame()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(api_cycle_frame, api_recovery_frame, api_session_frame)
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS)
      }
      val api_cycle_frame = readEIT_Acquisition_SupervisorCycleFrame()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(api_cycle_frame, api_recovery_frame, api_session_frame)
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P)
      }
      val api_collection_proposal = readEIT_Acquisition_SupervisorProposalType()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(api_collection_proposal)
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS)
      }
      val api_collection_proposal = readEIT_Acquisition_SupervisorProposalType()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(api_collection_proposal)
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P)
      }
      val api_image_frame = readEIT_Acquisition_SupervisorImageFrame()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(api_image_frame, api_recovery_frame, api_session_frame)
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS)
      }
      val api_image_frame = readEIT_Acquisition_SupervisorImageFrame()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(api_image_frame, api_recovery_frame, api_session_frame)
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P)
      }
      val api_release_proposal = readEIT_Acquisition_SupervisorProposalType()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(api_release_proposal)
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS)
      }
      val api_release_proposal = readEIT_Acquisition_SupervisorProposalType()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(api_release_proposal)
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P)
      }
      val api_collection_proposal = readEIT_Acquisition_SupervisorProposalType()
      val api_cycle_frame = readEIT_Acquisition_SupervisorCycleFrame()
      val api_image_frame = readEIT_Acquisition_SupervisorImageFrame()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_release_proposal = readEIT_Acquisition_SupervisorProposalType()
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(api_collection_proposal, api_cycle_frame, api_image_frame, api_recovery_frame, api_release_proposal, api_session_frame)
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS)
      }
      val api_collection_proposal = readEIT_Acquisition_SupervisorProposalType()
      val api_cycle_frame = readEIT_Acquisition_SupervisorCycleFrame()
      val api_image_frame = readEIT_Acquisition_SupervisorImageFrame()
      val api_recovery_frame = readEIT_Acquisition_SupervisorRecoveryFrame()
      val api_release_proposal = readEIT_Acquisition_SupervisorProposalType()
      val api_session_frame = readEIT_Acquisition_SupervisorSessionFrame()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(api_collection_proposal, api_cycle_frame, api_image_frame, api_recovery_frame, api_release_proposal, api_session_frame)
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P)
      }
      val api_decision_frame = readEIT_Acquisition_SupervisorDecisionFrame()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(api_decision_frame)
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS)
      }
      val api_decision_frame = readEIT_Acquisition_SupervisorDecisionFrame()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(api_decision_frame)
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container.")
          val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P = {
      val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P)
      }
      val api_decision_frame = readEIT_Acquisition_SupervisorDecisionFrame()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P(api_decision_frame)
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS)
      }
      val api_decision_frame = readEIT_Acquisition_SupervisorDecisionFrame()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(api_decision_frame)
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container.")
          val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P = {
      val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P)
      }
      val api_control_frame = readEIT_Acquisition_SupervisorControlFrame()
      val api_status_frame = readEIT_Acquisition_SupervisorStatusFrame()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P(api_control_frame, api_status_frame)
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS = {
      val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS)
      }
      val api_control_frame = readEIT_Acquisition_SupervisorControlFrame()
      val api_status_frame = readEIT_Acquisition_SupervisorStatusFrame()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(api_control_frame, api_status_frame)
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
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T)
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
        case Constants.EIT_Acquisition_SupervisorProposal_Payload => val r = readEIT_Acquisition_SupervisorProposal_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageState_Payload => val r = readEIT_Acquisition_SupervisorImageState_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorCycleState_Payload => val r = readEIT_Acquisition_SupervisorCycleState_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchFacts_Payload => val r = readEIT_Acquisition_SupervisorBatchFacts_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicMode_Payload => val r = readEIT_Acquisition_SupervisorPublicMode_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorCycleFrame_Payload => val r = readEIT_Acquisition_SupervisorCycleFrame_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageFrame_Payload => val r = readEIT_Acquisition_SupervisorImageFrame_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchSignal_Payload => val r = readEIT_Acquisition_SupervisorBatchSignal_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorStatusFrame_Payload => val r = readEIT_Acquisition_SupervisorStatusFrame_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryGate_Payload => val r = readEIT_Acquisition_SupervisorRecoveryGate_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionState_Payload => val r = readEIT_Acquisition_SupervisorSessionState_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageCommand_Payload => val r = readEIT_Acquisition_SupervisorImageCommand_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorRequestClass_Payload => val r = readEIT_Acquisition_SupervisorRequestClass_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorSignal_Payload => val r = readEIT_Acquisition_SupervisorDoctorSignal_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionFrame_Payload => val r = readEIT_Acquisition_SupervisorSessionFrame_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultSummary_Payload => val r = readEIT_Acquisition_SupervisorFaultSummary_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorControlFrame_Payload => val r = readEIT_Acquisition_SupervisorControlFrame_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryState_Payload => val r = readEIT_Acquisition_SupervisorRecoveryState_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryEvent_Payload => val r = readEIT_Acquisition_SupervisorRecoveryEvent_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageFeedback_Payload => val r = readEIT_Acquisition_SupervisorImageFeedback_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryCause_Payload => val r = readEIT_Acquisition_SupervisorRecoveryCause_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorSelectedCause_Payload => val r = readEIT_Acquisition_SupervisorSelectedCause_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorDominantFault_Payload => val r = readEIT_Acquisition_SupervisorDominantFault_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryFrame_Payload => val r = readEIT_Acquisition_SupervisorRecoveryFrame_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorDecisionFrame_Payload => val r = readEIT_Acquisition_SupervisorDecisionFrame_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentFacts_Payload => val r = readEIT_Acquisition_SupervisorEquipmentFacts_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorSelectedAction_Payload => val r = readEIT_Acquisition_SupervisorSelectedAction_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibility_Payload => val r = readEIT_Acquisition_SupervisorStartFeasibility_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageDisposition_Payload => val r = readEIT_Acquisition_SupervisorImageDisposition_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationFacts_Payload => val r = readEIT_Acquisition_SupervisorPreparationFacts_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultFacts_Payload => val r = readEIT_Acquisition_SupervisorImageResultFacts_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCommand_Payload => val r = readEIT_Acquisition_SupervisorAcquisitionCommand_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorRequestFactsRecord_Payload => val r = readEIT_Acquisition_SupervisorRequestFactsRecord_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentObservation_Payload => val r = readEIT_Acquisition_SupervisorEquipmentObservation_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationObservation_Payload => val r = readEIT_Acquisition_SupervisorPreparationObservation_PayloadT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T)
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

  def fromEIT_Acquisition_SupervisorDoctorSignal_Payload(o: EIT_Acquisition_Supervisor.DoctorSignal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDoctorSignal_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDoctorSignal_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DoctorSignal_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorSignal_Payload(reader: Reader): EIT_Acquisition_Supervisor.DoctorSignal_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorDoctorSignal_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDoctorSignal_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRequestClass_Payload(o: EIT_Acquisition_Supervisor.RequestClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRequestClass_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRequestClass_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RequestClass_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRequestClass_Payload(reader: Reader): EIT_Acquisition_Supervisor.RequestClass_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorRequestClass_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRequestClass_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationObservation_Payload(o: EIT_Acquisition_Supervisor.PreparationObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationObservation_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationObservation_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationObservation_Payload(reader: Reader): EIT_Acquisition_Supervisor.PreparationObservation_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationFacts_Payload(o: EIT_Acquisition_Supervisor.PreparationFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationFacts_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationFacts_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationFacts_Payload(reader: Reader): EIT_Acquisition_Supervisor.PreparationFacts_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentObservation_Payload(o: EIT_Acquisition_Supervisor.EquipmentObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentObservation_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentObservation_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentObservation_Payload(reader: Reader): EIT_Acquisition_Supervisor.EquipmentObservation_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentFacts_Payload(o: EIT_Acquisition_Supervisor.EquipmentFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentFacts_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentFacts_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentFacts_Payload(reader: Reader): EIT_Acquisition_Supervisor.EquipmentFacts_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchSignal_Payload(o: EIT_Acquisition_Supervisor.BatchSignal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchSignal_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchSignal_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchSignal_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchSignal_Payload(reader: Reader): EIT_Acquisition_Supervisor.BatchSignal_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorBatchSignal_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchSignal_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchFacts_Payload(o: EIT_Acquisition_Supervisor.BatchFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchFacts_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchFacts_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchFacts_Payload(reader: Reader): EIT_Acquisition_Supervisor.BatchFacts_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorBatchFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageFeedback_Payload(o: EIT_Acquisition_Supervisor.ImageFeedback_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageFeedback_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageFeedback_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageFeedback_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageFeedback_Payload(reader: Reader): EIT_Acquisition_Supervisor.ImageFeedback_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorImageFeedback_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageFeedback_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultFacts_Payload(o: EIT_Acquisition_Supervisor.ImageResultFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageResultFacts_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageResultFacts_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageResultFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultFacts_Payload(reader: Reader): EIT_Acquisition_Supervisor.ImageResultFacts_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorImageResultFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageResultFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDominantFault_Payload(o: EIT_Acquisition_Supervisor.DominantFault_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDominantFault_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDominantFault_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DominantFault_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDominantFault_Payload(reader: Reader): EIT_Acquisition_Supervisor.DominantFault_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorDominantFault_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDominantFault_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryState_Payload(o: EIT_Acquisition_Supervisor.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryState_Payload(reader: Reader): EIT_Acquisition_Supervisor.RecoveryState_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryGate_Payload(o: EIT_Acquisition_Supervisor.RecoveryGate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryGate_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryGate_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryGate_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryGate_Payload(reader: Reader): EIT_Acquisition_Supervisor.RecoveryGate_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryGate_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryGate_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryCause_Payload(o: EIT_Acquisition_Supervisor.RecoveryCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryCause_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryCause_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryCause_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryCause_Payload(reader: Reader): EIT_Acquisition_Supervisor.RecoveryCause_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryCause_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryCause_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibility_Payload(o: EIT_Acquisition_Supervisor.StartFeasibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStartFeasibility_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStartFeasibility_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StartFeasibility_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibility_Payload(reader: Reader): EIT_Acquisition_Supervisor.StartFeasibility_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorStartFeasibility_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStartFeasibility_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionState_Payload(o: EIT_Acquisition_Supervisor.SessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionState_Payload(reader: Reader): EIT_Acquisition_Supervisor.SessionState_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorSessionState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCycleState_Payload(o: EIT_Acquisition_Supervisor.CycleState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCycleState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCycleState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CycleState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCycleState_Payload(reader: Reader): EIT_Acquisition_Supervisor.CycleState_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorCycleState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCycleState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageState_Payload(o: EIT_Acquisition_Supervisor.ImageState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageState_Payload(reader: Reader): EIT_Acquisition_Supervisor.ImageState_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorImageState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryEvent_Payload(o: EIT_Acquisition_Supervisor.RecoveryEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryEvent_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryEvent_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryEvent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryEvent_Payload(reader: Reader): EIT_Acquisition_Supervisor.RecoveryEvent_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryEvent_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryEvent_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorProposal_Payload(o: EIT_Acquisition_Supervisor.Proposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorProposal_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorProposal_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.Proposal_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorProposal_Payload(reader: Reader): EIT_Acquisition_Supervisor.Proposal_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorProposal_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorProposal_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSelectedAction_Payload(o: EIT_Acquisition_Supervisor.SelectedAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSelectedAction_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSelectedAction_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SelectedAction_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSelectedAction_Payload(reader: Reader): EIT_Acquisition_Supervisor.SelectedAction_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorSelectedAction_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSelectedAction_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSelectedCause_Payload(o: EIT_Acquisition_Supervisor.SelectedCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSelectedCause_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSelectedCause_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SelectedCause_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSelectedCause_Payload(reader: Reader): EIT_Acquisition_Supervisor.SelectedCause_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorSelectedCause_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSelectedCause_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorAcquisitionCommand_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.AcquisitionCommand_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCommand_Payload(reader: Reader): EIT_Acquisition_Supervisor.AcquisitionCommand_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorAcquisitionCommand_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorAcquisitionCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageCommand_Payload(o: EIT_Acquisition_Supervisor.ImageCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageCommand_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageCommand_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageCommand_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageCommand_Payload(reader: Reader): EIT_Acquisition_Supervisor.ImageCommand_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorImageCommand_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicMode_Payload(o: EIT_Acquisition_Supervisor.PublicMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPublicMode_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPublicMode_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PublicMode_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicMode_Payload(reader: Reader): EIT_Acquisition_Supervisor.PublicMode_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorPublicMode_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPublicMode_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageDisposition_Payload(o: EIT_Acquisition_Supervisor.ImageDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageDisposition_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageDisposition_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageDisposition_Payload(reader: Reader): EIT_Acquisition_Supervisor.ImageDisposition_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorImageDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRequestFactsRecord(o: EIT_Acquisition_Supervisor.RequestFactsRecord, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRequestFactsRecord(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRequestFactsRecord(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RequestFactsRecord, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRequestFactsRecord(reader: Reader): EIT_Acquisition_Supervisor.RequestFactsRecord = {
      val r = reader.readEIT_Acquisition_SupervisorRequestFactsRecord()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRequestFactsRecord _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRequestFactsRecord_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RequestFactsRecord_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRequestFactsRecord_Payload(reader: Reader): EIT_Acquisition_Supervisor.RequestFactsRecord_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorRequestFactsRecord_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRequestFactsRecord_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultSummary(o: EIT_Acquisition_Supervisor.FaultSummary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultSummary(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultSummary(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultSummary, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultSummary(reader: Reader): EIT_Acquisition_Supervisor.FaultSummary = {
      val r = reader.readEIT_Acquisition_SupervisorFaultSummary()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultSummary _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultSummary_Payload(o: EIT_Acquisition_Supervisor.FaultSummary_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultSummary_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultSummary_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultSummary_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultSummary_Payload(reader: Reader): EIT_Acquisition_Supervisor.FaultSummary_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorFaultSummary_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultSummary_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryFrame(o: EIT_Acquisition_Supervisor.RecoveryFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryFrame(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryFrame(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryFrame, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryFrame(reader: Reader): EIT_Acquisition_Supervisor.RecoveryFrame = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryFrame()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryFrame_Payload(o: EIT_Acquisition_Supervisor.RecoveryFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryFrame_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryFrame_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryFrame_Payload(reader: Reader): EIT_Acquisition_Supervisor.RecoveryFrame_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionFrame(o: EIT_Acquisition_Supervisor.SessionFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionFrame(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionFrame(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionFrame, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionFrame(reader: Reader): EIT_Acquisition_Supervisor.SessionFrame = {
      val r = reader.readEIT_Acquisition_SupervisorSessionFrame()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionFrame_Payload(o: EIT_Acquisition_Supervisor.SessionFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionFrame_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionFrame_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionFrame_Payload(reader: Reader): EIT_Acquisition_Supervisor.SessionFrame_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorSessionFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCycleFrame(o: EIT_Acquisition_Supervisor.CycleFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCycleFrame(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCycleFrame(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CycleFrame, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCycleFrame(reader: Reader): EIT_Acquisition_Supervisor.CycleFrame = {
      val r = reader.readEIT_Acquisition_SupervisorCycleFrame()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCycleFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCycleFrame_Payload(o: EIT_Acquisition_Supervisor.CycleFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCycleFrame_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCycleFrame_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CycleFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCycleFrame_Payload(reader: Reader): EIT_Acquisition_Supervisor.CycleFrame_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorCycleFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCycleFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageFrame(o: EIT_Acquisition_Supervisor.ImageFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageFrame(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageFrame(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageFrame, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageFrame(reader: Reader): EIT_Acquisition_Supervisor.ImageFrame = {
      val r = reader.readEIT_Acquisition_SupervisorImageFrame()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageFrame_Payload(o: EIT_Acquisition_Supervisor.ImageFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageFrame_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageFrame_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageFrame_Payload(reader: Reader): EIT_Acquisition_Supervisor.ImageFrame_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorImageFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDecisionFrame(o: EIT_Acquisition_Supervisor.DecisionFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDecisionFrame(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDecisionFrame(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DecisionFrame, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDecisionFrame(reader: Reader): EIT_Acquisition_Supervisor.DecisionFrame = {
      val r = reader.readEIT_Acquisition_SupervisorDecisionFrame()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDecisionFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDecisionFrame_Payload(o: EIT_Acquisition_Supervisor.DecisionFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDecisionFrame_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDecisionFrame_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DecisionFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDecisionFrame_Payload(reader: Reader): EIT_Acquisition_Supervisor.DecisionFrame_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorDecisionFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDecisionFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorControlFrame(o: EIT_Acquisition_Supervisor.ControlFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorControlFrame(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorControlFrame(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ControlFrame, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorControlFrame(reader: Reader): EIT_Acquisition_Supervisor.ControlFrame = {
      val r = reader.readEIT_Acquisition_SupervisorControlFrame()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorControlFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorControlFrame_Payload(o: EIT_Acquisition_Supervisor.ControlFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorControlFrame_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorControlFrame_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ControlFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorControlFrame_Payload(reader: Reader): EIT_Acquisition_Supervisor.ControlFrame_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorControlFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorControlFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStatusFrame(o: EIT_Acquisition_Supervisor.StatusFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStatusFrame(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStatusFrame(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StatusFrame, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStatusFrame(reader: Reader): EIT_Acquisition_Supervisor.StatusFrame = {
      val r = reader.readEIT_Acquisition_SupervisorStatusFrame()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStatusFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStatusFrame_Payload(o: EIT_Acquisition_Supervisor.StatusFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStatusFrame_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStatusFrame_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StatusFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStatusFrame_Payload(reader: Reader): EIT_Acquisition_Supervisor.StatusFrame_Payload = {
      val r = reader.readEIT_Acquisition_SupervisorStatusFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStatusFrame_Payload _)
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

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(reader: Reader): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(reader: Reader): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container = {
      val r = reader.readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(reader: Reader): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(reader: Reader): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS _)
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