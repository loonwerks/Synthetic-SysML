// #Sireum
// @formatter:off

// This file is auto-generated from ImageSignal.scala, ImageFacts.scala, DoctorSignal.scala, ReviewFacts.scala, PreparationContext.scala, ContextFacts.scala, ServiceObservation.scala, ServiceFacts.scala, DominantFault.scala, RecoveryEvent.scala, RecoveryState.scala, EvidenceState.scala, AdmissionOutcome.scala, AdmissionReason.scala, ArtifactState.scala, AvailabilityDecision.scala, BlockReason.scala, ReviewState.scala, PresentationProposal.scala, SelectedAction.scala, SelectedReason.scala, UpstreamDisposition.scala, PublicMode.scala, Visibility.scala, FaultSummary.scala, RecoveryFrame.scala, EvidenceFrame.scala, AdmissionFrame.scala, ArtifactFrame.scala, AvailabilityDecisionFrame.scala, ReviewFrame.scala, PresentationFrame.scala, DecisionFrame.scala, AvailabilityFrame.scala, Base_Types.scala, ImageEventQualification_coordination_image_event_qualification_Containers.scala, DoctorEventQualification_coordination_doctor_event_qualification_Containers.scala, PreparationContextAssessment_coordination_preparation_context_assessment_Containers.scala, AvailabilityServiceAssessment_coordination_availability_service_assessment_Containers.scala, FaultComposition_coordination_fault_composition_Containers.scala, RecoveryControl_coordination_recovery_control_Containers.scala, EvidenceLifecycle_coordination_evidence_lifecycle_Containers.scala, AdmissionDecisionOwner_coordination_admission_decision_Containers.scala, ArtifactLifecycle_coordination_artifact_lifecycle_Containers.scala, AvailabilityDecisionOwner_coordination_availability_decision_Containers.scala, ReviewLifecycle_coordination_review_lifecycle_Containers.scala, PresentationDecisionOwner_coordination_presentation_decision_Containers.scala, AvailabilityArbitration_coordination_availability_arbitration_Containers.scala, PublicationComposition_coordination_publication_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package eit_image_availability_coordinator

import org.sireum._

object MsgPack {

  object Constants {

    val EIT_Image_Availability_CoordinatorImageSignal_Payload: Z = -32

    val EIT_Image_Availability_CoordinatorImageFacts_Payload: Z = -31

    val EIT_Image_Availability_CoordinatorDoctorSignal_Payload: Z = -30

    val EIT_Image_Availability_CoordinatorReviewFacts_Payload: Z = -29

    val EIT_Image_Availability_CoordinatorPreparationContext_Payload: Z = -28

    val EIT_Image_Availability_CoordinatorContextFacts_Payload: Z = -27

    val EIT_Image_Availability_CoordinatorServiceObservation_Payload: Z = -26

    val EIT_Image_Availability_CoordinatorServiceFacts_Payload: Z = -25

    val EIT_Image_Availability_CoordinatorDominantFault_Payload: Z = -24

    val EIT_Image_Availability_CoordinatorRecoveryEvent_Payload: Z = -23

    val EIT_Image_Availability_CoordinatorRecoveryState_Payload: Z = -22

    val EIT_Image_Availability_CoordinatorEvidenceState_Payload: Z = -21

    val EIT_Image_Availability_CoordinatorAdmissionOutcome_Payload: Z = -20

    val EIT_Image_Availability_CoordinatorAdmissionReason_Payload: Z = -19

    val EIT_Image_Availability_CoordinatorArtifactState_Payload: Z = -18

    val EIT_Image_Availability_CoordinatorAvailabilityDecision_Payload: Z = -17

    val EIT_Image_Availability_CoordinatorBlockReason_Payload: Z = -16

    val EIT_Image_Availability_CoordinatorReviewState_Payload: Z = -15

    val EIT_Image_Availability_CoordinatorPresentationProposal_Payload: Z = -14

    val EIT_Image_Availability_CoordinatorSelectedAction_Payload: Z = -13

    val EIT_Image_Availability_CoordinatorSelectedReason_Payload: Z = -12

    val EIT_Image_Availability_CoordinatorUpstreamDisposition_Payload: Z = -11

    val EIT_Image_Availability_CoordinatorPublicMode_Payload: Z = -10

    val EIT_Image_Availability_CoordinatorVisibility_Payload: Z = -9

    val EIT_Image_Availability_CoordinatorFaultSummary: Z = -8

    val EIT_Image_Availability_CoordinatorFaultSummary_Payload: Z = -7

    val EIT_Image_Availability_CoordinatorRecoveryFrame: Z = -6

    val EIT_Image_Availability_CoordinatorRecoveryFrame_Payload: Z = -5

    val EIT_Image_Availability_CoordinatorEvidenceFrame: Z = -4

    val EIT_Image_Availability_CoordinatorEvidenceFrame_Payload: Z = -3

    val EIT_Image_Availability_CoordinatorAdmissionFrame: Z = -2

    val EIT_Image_Availability_CoordinatorAdmissionFrame_Payload: Z = -1

    val EIT_Image_Availability_CoordinatorArtifactFrame: Z = 0

    val EIT_Image_Availability_CoordinatorArtifactFrame_Payload: Z = 1

    val EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame: Z = 2

    val EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload: Z = 3

    val EIT_Image_Availability_CoordinatorReviewFrame: Z = 4

    val EIT_Image_Availability_CoordinatorReviewFrame_Payload: Z = 5

    val EIT_Image_Availability_CoordinatorPresentationFrame: Z = 6

    val EIT_Image_Availability_CoordinatorPresentationFrame_Payload: Z = 7

    val EIT_Image_Availability_CoordinatorDecisionFrame: Z = 8

    val EIT_Image_Availability_CoordinatorDecisionFrame_Payload: Z = 9

    val EIT_Image_Availability_CoordinatorAvailabilityFrame: Z = 10

    val EIT_Image_Availability_CoordinatorAvailabilityFrame_Payload: Z = 11

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

    val EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P: Z = 28

    val EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS: Z = 29

    val EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P: Z = 30

    val EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS: Z = 31

    val EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P: Z = 32

    val EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS: Z = 33

    val EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P: Z = 34

    val EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS: Z = 35

    val EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P: Z = 36

    val EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS: Z = 37

    val EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P: Z = 38

    val EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS: Z = 39

    val EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P: Z = 40

    val EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS: Z = 41

    val EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P: Z = 42

    val EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS: Z = 43

    val EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P: Z = 44

    val EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS: Z = 45

    val EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P: Z = 46

    val EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS: Z = 47

    val EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P: Z = 48

    val EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS: Z = 49

    val EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P: Z = 50

    val EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS: Z = 51

    val EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P: Z = 52

    val EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS: Z = 53

    val EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P: Z = 54

    val EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS: Z = 55

    val EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P: Z = 56

    val EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS: Z = 57

    val EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P: Z = 58

    val EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS: Z = 59

    val EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P: Z = 60

    val EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS: Z = 61

    val EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P: Z = 62

    val EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS: Z = 63

    val EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P: Z = 64

    val EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS: Z = 65

    val EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P: Z = 66

    val EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS: Z = 67

    val EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P: Z = 68

    val EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS: Z = 69

    val EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P: Z = 70

    val EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS: Z = 71

    val EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P: Z = 72

    val EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS: Z = 73

    val EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P: Z = 74

    val EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS: Z = 75

    val EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P: Z = 76

    val EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS: Z = 77

    val EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P: Z = 78

    val EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS: Z = 79

    val EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P: Z = 80

    val EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS: Z = 81

    val EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P: Z = 82

    val EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS: Z = 83

    val utilEmptyContainer: Z = 84

    val _artEmpty: Z = 85

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeEIT_Image_Availability_CoordinatorImageSignalType(o: EIT_Image_Availability_Coordinator.ImageSignal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorImageSignal_Payload(o: EIT_Image_Availability_Coordinator.ImageSignal_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImageSignal_Payload)
      writeEIT_Image_Availability_CoordinatorImageSignalType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorImageFactsType(o: EIT_Image_Availability_Coordinator.ImageFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorImageFacts_Payload(o: EIT_Image_Availability_Coordinator.ImageFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImageFacts_Payload)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorDoctorSignalType(o: EIT_Image_Availability_Coordinator.DoctorSignal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o: EIT_Image_Availability_Coordinator.DoctorSignal_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctorSignal_Payload)
      writeEIT_Image_Availability_CoordinatorDoctorSignalType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorReviewFactsType(o: EIT_Image_Availability_Coordinator.ReviewFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorReviewFacts_Payload(o: EIT_Image_Availability_Coordinator.ReviewFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewFacts_Payload)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContextType(o: EIT_Image_Availability_Coordinator.PreparationContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContext_Payload(o: EIT_Image_Availability_Coordinator.PreparationContext_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPreparationContext_Payload)
      writeEIT_Image_Availability_CoordinatorPreparationContextType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorContextFactsType(o: EIT_Image_Availability_Coordinator.ContextFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorContextFacts_Payload(o: EIT_Image_Availability_Coordinator.ContextFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorContextFacts_Payload)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorServiceObservationType(o: EIT_Image_Availability_Coordinator.ServiceObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorServiceObservation_Payload(o: EIT_Image_Availability_Coordinator.ServiceObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorServiceObservation_Payload)
      writeEIT_Image_Availability_CoordinatorServiceObservationType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorServiceFactsType(o: EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorServiceFacts_Payload(o: EIT_Image_Availability_Coordinator.ServiceFacts_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorServiceFacts_Payload)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorDominantFaultType(o: EIT_Image_Availability_Coordinator.DominantFault.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorDominantFault_Payload(o: EIT_Image_Availability_Coordinator.DominantFault_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDominantFault_Payload)
      writeEIT_Image_Availability_CoordinatorDominantFaultType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryEventType(o: EIT_Image_Availability_Coordinator.RecoveryEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryEvent_Payload)
      writeEIT_Image_Availability_CoordinatorRecoveryEventType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryStateType(o: EIT_Image_Availability_Coordinator.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryState_Payload(o: EIT_Image_Availability_Coordinator.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryState_Payload)
      writeEIT_Image_Availability_CoordinatorRecoveryStateType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceStateType(o: EIT_Image_Availability_Coordinator.EvidenceState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceState_Payload(o: EIT_Image_Availability_Coordinator.EvidenceState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorEvidenceState_Payload)
      writeEIT_Image_Availability_CoordinatorEvidenceStateType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionOutcomeType(o: EIT_Image_Availability_Coordinator.AdmissionOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionOutcome_Payload)
      writeEIT_Image_Availability_CoordinatorAdmissionOutcomeType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionReasonType(o: EIT_Image_Availability_Coordinator.AdmissionReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o: EIT_Image_Availability_Coordinator.AdmissionReason_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionReason_Payload)
      writeEIT_Image_Availability_CoordinatorAdmissionReasonType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactStateType(o: EIT_Image_Availability_Coordinator.ArtifactState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactState_Payload(o: EIT_Image_Availability_Coordinator.ArtifactState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorArtifactState_Payload)
      writeEIT_Image_Availability_CoordinatorArtifactStateType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionType(o: EIT_Image_Availability_Coordinator.AvailabilityDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecision_Payload)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorBlockReasonType(o: EIT_Image_Availability_Coordinator.BlockReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorBlockReason_Payload(o: EIT_Image_Availability_Coordinator.BlockReason_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorBlockReason_Payload)
      writeEIT_Image_Availability_CoordinatorBlockReasonType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorReviewStateType(o: EIT_Image_Availability_Coordinator.ReviewState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Availability_Coordinator.ReviewState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewState_Payload)
      writeEIT_Image_Availability_CoordinatorReviewStateType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationProposalType(o: EIT_Image_Availability_Coordinator.PresentationProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o: EIT_Image_Availability_Coordinator.PresentationProposal_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPresentationProposal_Payload)
      writeEIT_Image_Availability_CoordinatorPresentationProposalType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorSelectedActionType(o: EIT_Image_Availability_Coordinator.SelectedAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorSelectedAction_Payload(o: EIT_Image_Availability_Coordinator.SelectedAction_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorSelectedAction_Payload)
      writeEIT_Image_Availability_CoordinatorSelectedActionType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorSelectedReasonType(o: EIT_Image_Availability_Coordinator.SelectedReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorSelectedReason_Payload(o: EIT_Image_Availability_Coordinator.SelectedReason_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorSelectedReason_Payload)
      writeEIT_Image_Availability_CoordinatorSelectedReasonType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorUpstreamDispositionType(o: EIT_Image_Availability_Coordinator.UpstreamDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorUpstreamDisposition_Payload)
      writeEIT_Image_Availability_CoordinatorUpstreamDispositionType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorPublicModeType(o: EIT_Image_Availability_Coordinator.PublicMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorPublicMode_Payload(o: EIT_Image_Availability_Coordinator.PublicMode_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPublicMode_Payload)
      writeEIT_Image_Availability_CoordinatorPublicModeType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorVisibilityType(o: EIT_Image_Availability_Coordinator.Visibility.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorVisibility_Payload(o: EIT_Image_Availability_Coordinator.Visibility_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorVisibility_Payload)
      writeEIT_Image_Availability_CoordinatorVisibilityType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorFaultSummary(o: EIT_Image_Availability_Coordinator.FaultSummary): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorFaultSummary)
      writer.writeB(o.faultPresent)
      writeEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)
      writer.writeB(o.multipleFaults)
    }

    def writeEIT_Image_Availability_CoordinatorFaultSummary_Payload(o: EIT_Image_Availability_Coordinator.FaultSummary_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorFaultSummary_Payload)
      writeEIT_Image_Availability_CoordinatorFaultSummary(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryFrame(o: EIT_Image_Availability_Coordinator.RecoveryFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryFrame)
      writeEIT_Image_Availability_CoordinatorRecoveryStateType(o.recoveryState)
      writer.writeB(o.recoveryOpen)
      writer.writeB(o.recoveryReleased)
      writer.writeB(o.effectiveFaultPresent)
      writeEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)
      writer.writeB(o.effectiveMultipleFaults)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryFrame_Payload)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceFrame(o: EIT_Image_Availability_Coordinator.EvidenceFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorEvidenceFrame)
      writeEIT_Image_Availability_CoordinatorEvidenceStateType(o.evidenceState)
      writer.writeB(o.contextAccepted)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorEvidenceFrame_Payload)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionFrame(o: EIT_Image_Availability_Coordinator.AdmissionFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionFrame)
      writeEIT_Image_Availability_CoordinatorAdmissionOutcomeType(o.outcome)
      writeEIT_Image_Availability_CoordinatorAdmissionReasonType(o.admissionReason)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionFrame_Payload)
      writeEIT_Image_Availability_CoordinatorAdmissionFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactFrame(o: EIT_Image_Availability_Coordinator.ArtifactFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorArtifactFrame)
      writeEIT_Image_Availability_CoordinatorArtifactStateType(o.artifactState)
      writer.writeB(o.withdrawProposal)
      writer.writeB(o.rejectProposal)
      writer.writeB(o.acceptProposal)
      writer.writeB(o.closureWindow)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorArtifactFrame_Payload)
      writeEIT_Image_Availability_CoordinatorArtifactFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionType(o.decision)
      writeEIT_Image_Availability_CoordinatorBlockReasonType(o.blockReason)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorReviewFrame(o: EIT_Image_Availability_Coordinator.ReviewFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewFrame)
      writeEIT_Image_Availability_CoordinatorReviewStateType(o.reviewState)
    }

    def writeEIT_Image_Availability_CoordinatorReviewFrame_Payload(o: EIT_Image_Availability_Coordinator.ReviewFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewFrame_Payload)
      writeEIT_Image_Availability_CoordinatorReviewFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationFrame(o: EIT_Image_Availability_Coordinator.PresentationFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPresentationFrame)
      writeEIT_Image_Availability_CoordinatorPresentationProposalType(o.proposal)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o: EIT_Image_Availability_Coordinator.PresentationFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPresentationFrame_Payload)
      writeEIT_Image_Availability_CoordinatorPresentationFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorDecisionFrame(o: EIT_Image_Availability_Coordinator.DecisionFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDecisionFrame)
      writer.writeB(o.availabilityAllowed)
      writeEIT_Image_Availability_CoordinatorSelectedActionType(o.selectedAction)
      writeEIT_Image_Availability_CoordinatorSelectedReasonType(o.selectedReason)
      writeEIT_Image_Availability_CoordinatorRecoveryStateType(o.recoveryState)
      writer.writeB(o.recoveryOpen)
      writer.writeB(o.recoveryReleased)
      writer.writeB(o.effectiveFaultPresent)
      writeEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)
      writer.writeB(o.effectiveMultipleFaults)
      writeEIT_Image_Availability_CoordinatorEvidenceStateType(o.evidenceState)
      writeEIT_Image_Availability_CoordinatorArtifactStateType(o.artifactState)
      writeEIT_Image_Availability_CoordinatorReviewStateType(o.reviewState)
    }

    def writeEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.DecisionFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDecisionFrame_Payload)
      writeEIT_Image_Availability_CoordinatorDecisionFrame(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityFrame(o: EIT_Image_Availability_Coordinator.AvailabilityFrame): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityFrame)
      writeEIT_Image_Availability_CoordinatorPublicModeType(o.publicMode)
      writeEIT_Image_Availability_CoordinatorVisibilityType(o.visibility)
      writeEIT_Image_Availability_CoordinatorSelectedReasonType(o.selectedReason)
      writeEIT_Image_Availability_CoordinatorRecoveryStateType(o.recoveryState)
      writeEIT_Image_Availability_CoordinatorEvidenceStateType(o.evidenceState)
      writeEIT_Image_Availability_CoordinatorArtifactStateType(o.artifactState)
      writeEIT_Image_Availability_CoordinatorReviewStateType(o.reviewState)
      writer.writeB(o.faultPresent)
      writeEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)
      writer.writeB(o.multipleFaults)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityFrame_Payload)
      writeEIT_Image_Availability_CoordinatorAvailabilityFrame(o.value)
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

    def writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorImageSignalType(o.api_imageSignal)
    }

    def writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorImageSignalType(o.api_imageSignal)
    }

    def writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
    }

    def writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
    }

    def writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorDoctorSignalType(o.api_doctorSignal)
    }

    def writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorDoctorSignalType(o.api_doctorSignal)
    }

    def writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
    }

    def writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorPreparationContextType(o.api_preparationContext)
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorPreparationContextType(o.api_preparationContext)
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
    }

    def writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorServiceObservationType(o.api_availabilityService)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorServiceObservationType(o.api_availabilityService)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary)
    }

    def writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary)
      writeEIT_Image_Availability_CoordinatorRecoveryEventType(o.api_recoveryEvent)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary)
      writeEIT_Image_Availability_CoordinatorRecoveryEventType(o.api_recoveryEvent)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
    }

    def writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
    }

    def writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)
      writeEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)
    }

    def writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
    }

    def writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
    }

    def writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)
    }

    def writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame)
    }

    def writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
      writeEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
      writeEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame)
    }

    def writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)
      writeEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
      writeEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)
      writeEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)
      writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)
      writeEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)
      writeEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame)
      writeEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)
      writeEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame)
    }

    def writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame)
    }

    def writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame)
    }

    def writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame)
    }

    def writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorAvailabilityFrame(o.api_analysisAvailability)
      writeEIT_Image_Availability_CoordinatorUpstreamDispositionType(o.api_upstreamDisposition)
    }

    def writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAvailabilityFrame(o.api_analysisAvailability)
      writeEIT_Image_Availability_CoordinatorUpstreamDispositionType(o.api_upstreamDisposition)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
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
        case o: EIT_Image_Availability_Coordinator.Visibility_Payload => writeEIT_Image_Availability_CoordinatorVisibility_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ImageFacts_Payload => writeEIT_Image_Availability_CoordinatorImageFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PublicMode_Payload => writeEIT_Image_Availability_CoordinatorPublicMode_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ReviewState_Payload => writeEIT_Image_Availability_CoordinatorReviewState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ImageSignal_Payload => writeEIT_Image_Availability_CoordinatorImageSignal_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ReviewFacts_Payload => writeEIT_Image_Availability_CoordinatorReviewFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.BlockReason_Payload => writeEIT_Image_Availability_CoordinatorBlockReason_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ReviewFrame_Payload => writeEIT_Image_Availability_CoordinatorReviewFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ServiceFacts_Payload => writeEIT_Image_Availability_CoordinatorServiceFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.DoctorSignal_Payload => writeEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ContextFacts_Payload => writeEIT_Image_Availability_CoordinatorContextFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.FaultSummary_Payload => writeEIT_Image_Availability_CoordinatorFaultSummary_Payload(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceState_Payload => writeEIT_Image_Availability_CoordinatorEvidenceState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryState_Payload => writeEIT_Image_Availability_CoordinatorRecoveryState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactState_Payload => writeEIT_Image_Availability_CoordinatorArtifactState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload => writeEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o)
        case o: EIT_Image_Availability_Coordinator.DominantFault_Payload => writeEIT_Image_Availability_CoordinatorDominantFault_Payload(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload => writeEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload => writeEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload => writeEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.DecisionFrame_Payload => writeEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.SelectedAction_Payload => writeEIT_Image_Availability_CoordinatorSelectedAction_Payload(o)
        case o: EIT_Image_Availability_Coordinator.SelectedReason_Payload => writeEIT_Image_Availability_CoordinatorSelectedReason_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload => writeEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionReason_Payload => writeEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload => writeEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PresentationFrame_Payload => writeEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload => writeEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ServiceObservation_Payload => writeEIT_Image_Availability_CoordinatorServiceObservation_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContext_Payload => writeEIT_Image_Availability_CoordinatorPreparationContext_Payload(o)
        case o: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload => writeEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload => writeEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PresentationProposal_Payload => writeEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
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

    def readEIT_Image_Availability_CoordinatorImageSignalType(): EIT_Image_Availability_Coordinator.ImageSignal.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ImageSignal.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorImageSignal_Payload(): EIT_Image_Availability_Coordinator.ImageSignal_Payload = {
      val r = readEIT_Image_Availability_CoordinatorImageSignal_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImageSignal_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageSignal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImageSignal_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorImageSignalType()
      return EIT_Image_Availability_Coordinator.ImageSignal_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorImageFactsType(): EIT_Image_Availability_Coordinator.ImageFacts.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ImageFacts.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorImageFacts_Payload(): EIT_Image_Availability_Coordinator.ImageFacts_Payload = {
      val r = readEIT_Image_Availability_CoordinatorImageFacts_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImageFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImageFacts_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorImageFactsType()
      return EIT_Image_Availability_Coordinator.ImageFacts_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorDoctorSignalType(): EIT_Image_Availability_Coordinator.DoctorSignal.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.DoctorSignal.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorDoctorSignal_Payload(): EIT_Image_Availability_Coordinator.DoctorSignal_Payload = {
      val r = readEIT_Image_Availability_CoordinatorDoctorSignal_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctorSignal_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorSignal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctorSignal_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorDoctorSignalType()
      return EIT_Image_Availability_Coordinator.DoctorSignal_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorReviewFactsType(): EIT_Image_Availability_Coordinator.ReviewFacts.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ReviewFacts.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorReviewFacts_Payload(): EIT_Image_Availability_Coordinator.ReviewFacts_Payload = {
      val r = readEIT_Image_Availability_CoordinatorReviewFacts_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewFacts_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorReviewFactsType()
      return EIT_Image_Availability_Coordinator.ReviewFacts_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextType(): EIT_Image_Availability_Coordinator.PreparationContext.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.PreparationContext.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorPreparationContext_Payload(): EIT_Image_Availability_Coordinator.PreparationContext_Payload = {
      val r = readEIT_Image_Availability_CoordinatorPreparationContext_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPreparationContext_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPreparationContext_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorPreparationContextType()
      return EIT_Image_Availability_Coordinator.PreparationContext_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorContextFactsType(): EIT_Image_Availability_Coordinator.ContextFacts.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ContextFacts.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorContextFacts_Payload(): EIT_Image_Availability_Coordinator.ContextFacts_Payload = {
      val r = readEIT_Image_Availability_CoordinatorContextFacts_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorContextFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ContextFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorContextFacts_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorContextFactsType()
      return EIT_Image_Availability_Coordinator.ContextFacts_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorServiceObservationType(): EIT_Image_Availability_Coordinator.ServiceObservation.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ServiceObservation.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorServiceObservation_Payload(): EIT_Image_Availability_Coordinator.ServiceObservation_Payload = {
      val r = readEIT_Image_Availability_CoordinatorServiceObservation_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorServiceObservation_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ServiceObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorServiceObservation_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorServiceObservationType()
      return EIT_Image_Availability_Coordinator.ServiceObservation_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorServiceFactsType(): EIT_Image_Availability_Coordinator.ServiceFacts.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ServiceFacts.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorServiceFacts_Payload(): EIT_Image_Availability_Coordinator.ServiceFacts_Payload = {
      val r = readEIT_Image_Availability_CoordinatorServiceFacts_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorServiceFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ServiceFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorServiceFacts_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.ServiceFacts_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorDominantFaultType(): EIT_Image_Availability_Coordinator.DominantFault.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.DominantFault.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorDominantFault_Payload(): EIT_Image_Availability_Coordinator.DominantFault_Payload = {
      val r = readEIT_Image_Availability_CoordinatorDominantFault_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDominantFault_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.DominantFault_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDominantFault_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorDominantFaultType()
      return EIT_Image_Availability_Coordinator.DominantFault_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryEventType(): EIT_Image_Availability_Coordinator.RecoveryEvent.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.RecoveryEvent.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(): EIT_Image_Availability_Coordinator.RecoveryEvent_Payload = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryEvent_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryEvent_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryEvent_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorRecoveryEventType()
      return EIT_Image_Availability_Coordinator.RecoveryEvent_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryStateType(): EIT_Image_Availability_Coordinator.RecoveryState.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.RecoveryState.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorRecoveryState_Payload(): EIT_Image_Availability_Coordinator.RecoveryState_Payload = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryState_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorRecoveryStateType()
      return EIT_Image_Availability_Coordinator.RecoveryState_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorEvidenceStateType(): EIT_Image_Availability_Coordinator.EvidenceState.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.EvidenceState.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorEvidenceState_Payload(): EIT_Image_Availability_Coordinator.EvidenceState_Payload = {
      val r = readEIT_Image_Availability_CoordinatorEvidenceState_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorEvidenceState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorEvidenceState_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorEvidenceStateType()
      return EIT_Image_Availability_Coordinator.EvidenceState_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionOutcomeType(): EIT_Image_Availability_Coordinator.AdmissionOutcome.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.AdmissionOutcome.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(): EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionOutcome_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionOutcome_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionOutcome_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAdmissionOutcomeType()
      return EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionReasonType(): EIT_Image_Availability_Coordinator.AdmissionReason.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.AdmissionReason.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorAdmissionReason_Payload(): EIT_Image_Availability_Coordinator.AdmissionReason_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionReason_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionReason_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionReason_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAdmissionReasonType()
      return EIT_Image_Availability_Coordinator.AdmissionReason_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorArtifactStateType(): EIT_Image_Availability_Coordinator.ArtifactState.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ArtifactState.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorArtifactState_Payload(): EIT_Image_Availability_Coordinator.ArtifactState_Payload = {
      val r = readEIT_Image_Availability_CoordinatorArtifactState_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorArtifactState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorArtifactState_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorArtifactStateType()
      return EIT_Image_Availability_Coordinator.ArtifactState_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionType(): EIT_Image_Availability_Coordinator.AvailabilityDecision.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.AvailabilityDecision.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(): EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityDecision_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecision_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecision_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAvailabilityDecisionType()
      return EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorBlockReasonType(): EIT_Image_Availability_Coordinator.BlockReason.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.BlockReason.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorBlockReason_Payload(): EIT_Image_Availability_Coordinator.BlockReason_Payload = {
      val r = readEIT_Image_Availability_CoordinatorBlockReason_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorBlockReason_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.BlockReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorBlockReason_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorBlockReasonType()
      return EIT_Image_Availability_Coordinator.BlockReason_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorReviewStateType(): EIT_Image_Availability_Coordinator.ReviewState.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.ReviewState.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorReviewState_Payload(): EIT_Image_Availability_Coordinator.ReviewState_Payload = {
      val r = readEIT_Image_Availability_CoordinatorReviewState_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewState_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorReviewStateType()
      return EIT_Image_Availability_Coordinator.ReviewState_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorPresentationProposalType(): EIT_Image_Availability_Coordinator.PresentationProposal.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.PresentationProposal.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorPresentationProposal_Payload(): EIT_Image_Availability_Coordinator.PresentationProposal_Payload = {
      val r = readEIT_Image_Availability_CoordinatorPresentationProposal_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPresentationProposal_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPresentationProposal_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorPresentationProposalType()
      return EIT_Image_Availability_Coordinator.PresentationProposal_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorSelectedActionType(): EIT_Image_Availability_Coordinator.SelectedAction.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.SelectedAction.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorSelectedAction_Payload(): EIT_Image_Availability_Coordinator.SelectedAction_Payload = {
      val r = readEIT_Image_Availability_CoordinatorSelectedAction_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorSelectedAction_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.SelectedAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorSelectedAction_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorSelectedActionType()
      return EIT_Image_Availability_Coordinator.SelectedAction_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorSelectedReasonType(): EIT_Image_Availability_Coordinator.SelectedReason.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.SelectedReason.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorSelectedReason_Payload(): EIT_Image_Availability_Coordinator.SelectedReason_Payload = {
      val r = readEIT_Image_Availability_CoordinatorSelectedReason_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorSelectedReason_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.SelectedReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorSelectedReason_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorSelectedReasonType()
      return EIT_Image_Availability_Coordinator.SelectedReason_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorUpstreamDispositionType(): EIT_Image_Availability_Coordinator.UpstreamDisposition.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.UpstreamDisposition.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(): EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload = {
      val r = readEIT_Image_Availability_CoordinatorUpstreamDisposition_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorUpstreamDisposition_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorUpstreamDisposition_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorUpstreamDispositionType()
      return EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorPublicModeType(): EIT_Image_Availability_Coordinator.PublicMode.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.PublicMode.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorPublicMode_Payload(): EIT_Image_Availability_Coordinator.PublicMode_Payload = {
      val r = readEIT_Image_Availability_CoordinatorPublicMode_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPublicMode_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PublicMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPublicMode_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorPublicModeType()
      return EIT_Image_Availability_Coordinator.PublicMode_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorVisibilityType(): EIT_Image_Availability_Coordinator.Visibility.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Visibility.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorVisibility_Payload(): EIT_Image_Availability_Coordinator.Visibility_Payload = {
      val r = readEIT_Image_Availability_CoordinatorVisibility_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorVisibility_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Visibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorVisibility_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorVisibilityType()
      return EIT_Image_Availability_Coordinator.Visibility_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorFaultSummary(): EIT_Image_Availability_Coordinator.FaultSummary = {
      val r = readEIT_Image_Availability_CoordinatorFaultSummaryT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorFaultSummaryT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultSummary = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorFaultSummary)
      }
      val faultPresent = reader.readB()
      val dominantFault = readEIT_Image_Availability_CoordinatorDominantFaultType()
      val multipleFaults = reader.readB()
      return EIT_Image_Availability_Coordinator.FaultSummary(faultPresent, dominantFault, multipleFaults)
    }

    def readEIT_Image_Availability_CoordinatorFaultSummary_Payload(): EIT_Image_Availability_Coordinator.FaultSummary_Payload = {
      val r = readEIT_Image_Availability_CoordinatorFaultSummary_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorFaultSummary_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultSummary_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorFaultSummary_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorFaultSummary()
      return EIT_Image_Availability_Coordinator.FaultSummary_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryFrame(): EIT_Image_Availability_Coordinator.RecoveryFrame = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryFrame)
      }
      val recoveryState = readEIT_Image_Availability_CoordinatorRecoveryStateType()
      val recoveryOpen = reader.readB()
      val recoveryReleased = reader.readB()
      val effectiveFaultPresent = reader.readB()
      val dominantFault = readEIT_Image_Availability_CoordinatorDominantFaultType()
      val effectiveMultipleFaults = reader.readB()
      return EIT_Image_Availability_Coordinator.RecoveryFrame(recoveryState, recoveryOpen, recoveryReleased, effectiveFaultPresent, dominantFault, effectiveMultipleFaults)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(): EIT_Image_Availability_Coordinator.RecoveryFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      return EIT_Image_Availability_Coordinator.RecoveryFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorEvidenceFrame(): EIT_Image_Availability_Coordinator.EvidenceFrame = {
      val r = readEIT_Image_Availability_CoordinatorEvidenceFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorEvidenceFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorEvidenceFrame)
      }
      val evidenceState = readEIT_Image_Availability_CoordinatorEvidenceStateType()
      val contextAccepted = reader.readB()
      return EIT_Image_Availability_Coordinator.EvidenceFrame(evidenceState, contextAccepted)
    }

    def readEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(): EIT_Image_Availability_Coordinator.EvidenceFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorEvidenceFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorEvidenceFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorEvidenceFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      return EIT_Image_Availability_Coordinator.EvidenceFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionFrame(): EIT_Image_Availability_Coordinator.AdmissionFrame = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionFrame)
      }
      val outcome = readEIT_Image_Availability_CoordinatorAdmissionOutcomeType()
      val admissionReason = readEIT_Image_Availability_CoordinatorAdmissionReasonType()
      return EIT_Image_Availability_Coordinator.AdmissionFrame(outcome, admissionReason)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(): EIT_Image_Availability_Coordinator.AdmissionFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAdmissionFrame()
      return EIT_Image_Availability_Coordinator.AdmissionFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorArtifactFrame(): EIT_Image_Availability_Coordinator.ArtifactFrame = {
      val r = readEIT_Image_Availability_CoordinatorArtifactFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorArtifactFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorArtifactFrame)
      }
      val artifactState = readEIT_Image_Availability_CoordinatorArtifactStateType()
      val withdrawProposal = reader.readB()
      val rejectProposal = reader.readB()
      val acceptProposal = reader.readB()
      val closureWindow = reader.readB()
      return EIT_Image_Availability_Coordinator.ArtifactFrame(artifactState, withdrawProposal, rejectProposal, acceptProposal, closureWindow)
    }

    def readEIT_Image_Availability_CoordinatorArtifactFrame_Payload(): EIT_Image_Availability_Coordinator.ArtifactFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorArtifactFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorArtifactFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorArtifactFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorArtifactFrame()
      return EIT_Image_Availability_Coordinator.ArtifactFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame)
      }
      val decision = readEIT_Image_Availability_CoordinatorAvailabilityDecisionType()
      val blockReason = readEIT_Image_Availability_CoordinatorBlockReasonType()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame(decision, blockReason)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorReviewFrame(): EIT_Image_Availability_Coordinator.ReviewFrame = {
      val r = readEIT_Image_Availability_CoordinatorReviewFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewFrame)
      }
      val reviewState = readEIT_Image_Availability_CoordinatorReviewStateType()
      return EIT_Image_Availability_Coordinator.ReviewFrame(reviewState)
    }

    def readEIT_Image_Availability_CoordinatorReviewFrame_Payload(): EIT_Image_Availability_Coordinator.ReviewFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorReviewFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorReviewFrame()
      return EIT_Image_Availability_Coordinator.ReviewFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorPresentationFrame(): EIT_Image_Availability_Coordinator.PresentationFrame = {
      val r = readEIT_Image_Availability_CoordinatorPresentationFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPresentationFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPresentationFrame)
      }
      val proposal = readEIT_Image_Availability_CoordinatorPresentationProposalType()
      return EIT_Image_Availability_Coordinator.PresentationFrame(proposal)
    }

    def readEIT_Image_Availability_CoordinatorPresentationFrame_Payload(): EIT_Image_Availability_Coordinator.PresentationFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorPresentationFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPresentationFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPresentationFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorPresentationFrame()
      return EIT_Image_Availability_Coordinator.PresentationFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorDecisionFrame(): EIT_Image_Availability_Coordinator.DecisionFrame = {
      val r = readEIT_Image_Availability_CoordinatorDecisionFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDecisionFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.DecisionFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDecisionFrame)
      }
      val availabilityAllowed = reader.readB()
      val selectedAction = readEIT_Image_Availability_CoordinatorSelectedActionType()
      val selectedReason = readEIT_Image_Availability_CoordinatorSelectedReasonType()
      val recoveryState = readEIT_Image_Availability_CoordinatorRecoveryStateType()
      val recoveryOpen = reader.readB()
      val recoveryReleased = reader.readB()
      val effectiveFaultPresent = reader.readB()
      val dominantFault = readEIT_Image_Availability_CoordinatorDominantFaultType()
      val effectiveMultipleFaults = reader.readB()
      val evidenceState = readEIT_Image_Availability_CoordinatorEvidenceStateType()
      val artifactState = readEIT_Image_Availability_CoordinatorArtifactStateType()
      val reviewState = readEIT_Image_Availability_CoordinatorReviewStateType()
      return EIT_Image_Availability_Coordinator.DecisionFrame(availabilityAllowed, selectedAction, selectedReason, recoveryState, recoveryOpen, recoveryReleased, effectiveFaultPresent, dominantFault, effectiveMultipleFaults, evidenceState, artifactState, reviewState)
    }

    def readEIT_Image_Availability_CoordinatorDecisionFrame_Payload(): EIT_Image_Availability_Coordinator.DecisionFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorDecisionFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDecisionFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.DecisionFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDecisionFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorDecisionFrame()
      return EIT_Image_Availability_Coordinator.DecisionFrame_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityFrame(): EIT_Image_Availability_Coordinator.AvailabilityFrame = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityFrameT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityFrame)
      }
      val publicMode = readEIT_Image_Availability_CoordinatorPublicModeType()
      val visibility = readEIT_Image_Availability_CoordinatorVisibilityType()
      val selectedReason = readEIT_Image_Availability_CoordinatorSelectedReasonType()
      val recoveryState = readEIT_Image_Availability_CoordinatorRecoveryStateType()
      val evidenceState = readEIT_Image_Availability_CoordinatorEvidenceStateType()
      val artifactState = readEIT_Image_Availability_CoordinatorArtifactStateType()
      val reviewState = readEIT_Image_Availability_CoordinatorReviewStateType()
      val faultPresent = reader.readB()
      val dominantFault = readEIT_Image_Availability_CoordinatorDominantFaultType()
      val multipleFaults = reader.readB()
      return EIT_Image_Availability_Coordinator.AvailabilityFrame(publicMode, visibility, selectedReason, recoveryState, evidenceState, artifactState, reviewState, faultPresent, dominantFault, multipleFaults)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(): EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityFrame_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityFrame_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAvailabilityFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload(value)
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

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P)
      }
      val api_imageSignal = readEIT_Image_Availability_CoordinatorImageSignalType()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P(api_imageSignal)
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS)
      }
      val api_imageSignal = readEIT_Image_Availability_CoordinatorImageSignalType()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(api_imageSignal)
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P)
      }
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P(api_imageFacts)
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS)
      }
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(api_imageFacts)
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P)
      }
      val api_doctorSignal = readEIT_Image_Availability_CoordinatorDoctorSignalType()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(api_doctorSignal)
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS)
      }
      val api_doctorSignal = readEIT_Image_Availability_CoordinatorDoctorSignalType()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(api_doctorSignal)
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P)
      }
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(api_reviewFacts)
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS)
      }
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(api_reviewFacts)
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P)
      }
      val api_preparationContext = readEIT_Image_Availability_CoordinatorPreparationContextType()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(api_preparationContext)
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS)
      }
      val api_preparationContext = readEIT_Image_Availability_CoordinatorPreparationContextType()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(api_preparationContext)
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(api_contextFacts)
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(api_contextFacts)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P)
      }
      val api_availabilityService = readEIT_Image_Availability_CoordinatorServiceObservationType()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(api_availabilityService)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS)
      }
      val api_availabilityService = readEIT_Image_Availability_CoordinatorServiceObservationType()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(api_availabilityService)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P)
      }
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS)
      }
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P(api_contextFacts, api_imageFacts, api_reviewFacts, api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS(api_contextFacts, api_imageFacts, api_reviewFacts, api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P)
      }
      val api_faultSummary = readEIT_Image_Availability_CoordinatorFaultSummary()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P(api_faultSummary)
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS)
      }
      val api_faultSummary = readEIT_Image_Availability_CoordinatorFaultSummary()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS(api_faultSummary)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P)
      }
      val api_faultSummary = readEIT_Image_Availability_CoordinatorFaultSummary()
      val api_recoveryEvent = readEIT_Image_Availability_CoordinatorRecoveryEventType()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P(api_faultSummary, api_recoveryEvent)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS)
      }
      val api_faultSummary = readEIT_Image_Availability_CoordinatorFaultSummary()
      val api_recoveryEvent = readEIT_Image_Availability_CoordinatorRecoveryEventType()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS(api_faultSummary, api_recoveryEvent)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P)
      }
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P(api_recoveryFrame)
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS)
      }
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS(api_recoveryFrame)
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(api_contextFacts, api_imageFacts, api_recoveryFrame)
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(api_contextFacts, api_imageFacts, api_recoveryFrame)
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P)
      }
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(api_evidenceFrame)
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS)
      }
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(api_evidenceFrame)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(api_contextFacts, api_evidenceFrame, api_imageFacts, api_recoveryFrame, api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS)
      }
      val api_contextFacts = readEIT_Image_Availability_CoordinatorContextFactsType()
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(api_contextFacts, api_evidenceFrame, api_imageFacts, api_recoveryFrame, api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P)
      }
      val api_admissionFrame = readEIT_Image_Availability_CoordinatorAdmissionFrame()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(api_admissionFrame)
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS)
      }
      val api_admissionFrame = readEIT_Image_Availability_CoordinatorAdmissionFrame()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(api_admissionFrame)
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P)
      }
      val api_admissionFrame = readEIT_Image_Availability_CoordinatorAdmissionFrame()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(api_admissionFrame, api_imageFacts, api_recoveryFrame, api_reviewFacts)
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS)
      }
      val api_admissionFrame = readEIT_Image_Availability_CoordinatorAdmissionFrame()
      val api_imageFacts = readEIT_Image_Availability_CoordinatorImageFactsType()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(api_admissionFrame, api_imageFacts, api_recoveryFrame, api_reviewFacts)
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P)
      }
      val api_artifactFrame = readEIT_Image_Availability_CoordinatorArtifactFrame()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(api_artifactFrame)
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS)
      }
      val api_artifactFrame = readEIT_Image_Availability_CoordinatorArtifactFrame()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(api_artifactFrame)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P)
      }
      val api_artifactFrame = readEIT_Image_Availability_CoordinatorArtifactFrame()
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(api_artifactFrame, api_evidenceFrame, api_recoveryFrame, api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS)
      }
      val api_artifactFrame = readEIT_Image_Availability_CoordinatorArtifactFrame()
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_serviceFacts = readEIT_Image_Availability_CoordinatorServiceFactsType()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(api_artifactFrame, api_evidenceFrame, api_recoveryFrame, api_serviceFacts)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P)
      }
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(api_availabilityFrame)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS)
      }
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(api_availabilityFrame)
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P)
      }
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(api_availabilityFrame, api_recoveryFrame, api_reviewFacts)
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS)
      }
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_reviewFacts = readEIT_Image_Availability_CoordinatorReviewFactsType()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(api_availabilityFrame, api_recoveryFrame, api_reviewFacts)
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P)
      }
      val api_reviewFrame = readEIT_Image_Availability_CoordinatorReviewFrame()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(api_reviewFrame)
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS)
      }
      val api_reviewFrame = readEIT_Image_Availability_CoordinatorReviewFrame()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(api_reviewFrame)
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P)
      }
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      val api_reviewFrame = readEIT_Image_Availability_CoordinatorReviewFrame()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(api_availabilityFrame, api_reviewFrame)
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS)
      }
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      val api_reviewFrame = readEIT_Image_Availability_CoordinatorReviewFrame()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(api_availabilityFrame, api_reviewFrame)
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P)
      }
      val api_presentationFrame = readEIT_Image_Availability_CoordinatorPresentationFrame()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(api_presentationFrame)
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS)
      }
      val api_presentationFrame = readEIT_Image_Availability_CoordinatorPresentationFrame()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(api_presentationFrame)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P)
      }
      val api_admissionFrame = readEIT_Image_Availability_CoordinatorAdmissionFrame()
      val api_artifactFrame = readEIT_Image_Availability_CoordinatorArtifactFrame()
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      val api_presentationFrame = readEIT_Image_Availability_CoordinatorPresentationFrame()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_reviewFrame = readEIT_Image_Availability_CoordinatorReviewFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(api_admissionFrame, api_artifactFrame, api_availabilityFrame, api_evidenceFrame, api_presentationFrame, api_recoveryFrame, api_reviewFrame)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS)
      }
      val api_admissionFrame = readEIT_Image_Availability_CoordinatorAdmissionFrame()
      val api_artifactFrame = readEIT_Image_Availability_CoordinatorArtifactFrame()
      val api_availabilityFrame = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      val api_evidenceFrame = readEIT_Image_Availability_CoordinatorEvidenceFrame()
      val api_presentationFrame = readEIT_Image_Availability_CoordinatorPresentationFrame()
      val api_recoveryFrame = readEIT_Image_Availability_CoordinatorRecoveryFrame()
      val api_reviewFrame = readEIT_Image_Availability_CoordinatorReviewFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(api_admissionFrame, api_artifactFrame, api_availabilityFrame, api_evidenceFrame, api_presentationFrame, api_recoveryFrame, api_reviewFrame)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P)
      }
      val api_decisionFrame = readEIT_Image_Availability_CoordinatorDecisionFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(api_decisionFrame)
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS)
      }
      val api_decisionFrame = readEIT_Image_Availability_CoordinatorDecisionFrame()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(api_decisionFrame)
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P)
      }
      val api_decisionFrame = readEIT_Image_Availability_CoordinatorDecisionFrame()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P(api_decisionFrame)
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS)
      }
      val api_decisionFrame = readEIT_Image_Availability_CoordinatorDecisionFrame()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS(api_decisionFrame)
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P)
      }
      val api_analysisAvailability = readEIT_Image_Availability_CoordinatorAvailabilityFrame()
      val api_upstreamDisposition = readEIT_Image_Availability_CoordinatorUpstreamDispositionType()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P(api_analysisAvailability, api_upstreamDisposition)
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS)
      }
      val api_analysisAvailability = readEIT_Image_Availability_CoordinatorAvailabilityFrame()
      val api_upstreamDisposition = readEIT_Image_Availability_CoordinatorUpstreamDispositionType()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS(api_analysisAvailability, api_upstreamDisposition)
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
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T)
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
        case Constants.EIT_Image_Availability_CoordinatorVisibility_Payload => val r = readEIT_Image_Availability_CoordinatorVisibility_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageFacts_Payload => val r = readEIT_Image_Availability_CoordinatorImageFacts_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicMode_Payload => val r = readEIT_Image_Availability_CoordinatorPublicMode_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewState_Payload => val r = readEIT_Image_Availability_CoordinatorReviewState_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageSignal_Payload => val r = readEIT_Image_Availability_CoordinatorImageSignal_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewFacts_Payload => val r = readEIT_Image_Availability_CoordinatorReviewFacts_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorBlockReason_Payload => val r = readEIT_Image_Availability_CoordinatorBlockReason_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewFrame_Payload => val r = readEIT_Image_Availability_CoordinatorReviewFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorServiceFacts_Payload => val r = readEIT_Image_Availability_CoordinatorServiceFacts_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorSignal_Payload => val r = readEIT_Image_Availability_CoordinatorDoctorSignal_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorContextFacts_Payload => val r = readEIT_Image_Availability_CoordinatorContextFacts_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultSummary_Payload => val r = readEIT_Image_Availability_CoordinatorFaultSummary_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceState_Payload => val r = readEIT_Image_Availability_CoordinatorEvidenceState_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryState_Payload => val r = readEIT_Image_Availability_CoordinatorRecoveryState_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactState_Payload => val r = readEIT_Image_Availability_CoordinatorArtifactState_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryEvent_Payload => val r = readEIT_Image_Availability_CoordinatorRecoveryEvent_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDominantFault_Payload => val r = readEIT_Image_Availability_CoordinatorDominantFault_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceFrame_Payload => val r = readEIT_Image_Availability_CoordinatorEvidenceFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactFrame_Payload => val r = readEIT_Image_Availability_CoordinatorArtifactFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryFrame_Payload => val r = readEIT_Image_Availability_CoordinatorRecoveryFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDecisionFrame_Payload => val r = readEIT_Image_Availability_CoordinatorDecisionFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorSelectedAction_Payload => val r = readEIT_Image_Availability_CoordinatorSelectedAction_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorSelectedReason_Payload => val r = readEIT_Image_Availability_CoordinatorSelectedReason_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionFrame_Payload => val r = readEIT_Image_Availability_CoordinatorAdmissionFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionReason_Payload => val r = readEIT_Image_Availability_CoordinatorAdmissionReason_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionOutcome_Payload => val r = readEIT_Image_Availability_CoordinatorAdmissionOutcome_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationFrame_Payload => val r = readEIT_Image_Availability_CoordinatorPresentationFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityFrame_Payload => val r = readEIT_Image_Availability_CoordinatorAvailabilityFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorServiceObservation_Payload => val r = readEIT_Image_Availability_CoordinatorServiceObservation_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContext_Payload => val r = readEIT_Image_Availability_CoordinatorPreparationContext_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstreamDisposition_Payload => val r = readEIT_Image_Availability_CoordinatorUpstreamDisposition_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecision_Payload => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecision_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationProposal_Payload => val r = readEIT_Image_Availability_CoordinatorPresentationProposal_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T)
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

  def fromEIT_Image_Availability_CoordinatorImageSignal_Payload(o: EIT_Image_Availability_Coordinator.ImageSignal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageSignal_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageSignal_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageSignal_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageSignal_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ImageSignal_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageSignal_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageSignal_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageFacts_Payload(o: EIT_Image_Availability_Coordinator.ImageFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageFacts_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageFacts_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageFacts_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ImageFacts_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o: EIT_Image_Availability_Coordinator.DoctorSignal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctorSignal_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DoctorSignal_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorSignal_Payload(reader: Reader): EIT_Image_Availability_Coordinator.DoctorSignal_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctorSignal_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctorSignal_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewFacts_Payload(o: EIT_Image_Availability_Coordinator.ReviewFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewFacts_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewFacts_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewFacts_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ReviewFacts_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContext_Payload(o: EIT_Image_Availability_Coordinator.PreparationContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPreparationContext_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPreparationContext_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PreparationContext_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContext_Payload(reader: Reader): EIT_Image_Availability_Coordinator.PreparationContext_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorPreparationContext_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPreparationContext_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorContextFacts_Payload(o: EIT_Image_Availability_Coordinator.ContextFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorContextFacts_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorContextFacts_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ContextFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorContextFacts_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ContextFacts_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorContextFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorContextFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorServiceObservation_Payload(o: EIT_Image_Availability_Coordinator.ServiceObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorServiceObservation_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorServiceObservation_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ServiceObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorServiceObservation_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ServiceObservation_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorServiceObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorServiceObservation_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorServiceFacts_Payload(o: EIT_Image_Availability_Coordinator.ServiceFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorServiceFacts_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorServiceFacts_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ServiceFacts_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorServiceFacts_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ServiceFacts_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorServiceFacts_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorServiceFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDominantFault_Payload(o: EIT_Image_Availability_Coordinator.DominantFault_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDominantFault_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDominantFault_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DominantFault_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDominantFault_Payload(reader: Reader): EIT_Image_Availability_Coordinator.DominantFault_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorDominantFault_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDominantFault_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryEvent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryEvent_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryEvent_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryEvent_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryState_Payload(o: EIT_Image_Availability_Coordinator.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryState_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryState_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryState_Payload(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryState_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceState_Payload(o: EIT_Image_Availability_Coordinator.EvidenceState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceState_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceState_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceState_Payload(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceState_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o: EIT_Image_Availability_Coordinator.AdmissionReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionReason_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionReason_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionReason_Payload(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionReason_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionReason_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionReason_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactState_Payload(o: EIT_Image_Availability_Coordinator.ArtifactState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactState_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactState_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactState_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactState_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorBlockReason_Payload(o: EIT_Image_Availability_Coordinator.BlockReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorBlockReason_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorBlockReason_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.BlockReason_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorBlockReason_Payload(reader: Reader): EIT_Image_Availability_Coordinator.BlockReason_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorBlockReason_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorBlockReason_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Availability_Coordinator.ReviewState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewState_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewState_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewState_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ReviewState_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o: EIT_Image_Availability_Coordinator.PresentationProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationProposal_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationProposal_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationProposal_Payload(reader: Reader): EIT_Image_Availability_Coordinator.PresentationProposal_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationProposal_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationProposal_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorSelectedAction_Payload(o: EIT_Image_Availability_Coordinator.SelectedAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorSelectedAction_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorSelectedAction_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.SelectedAction_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorSelectedAction_Payload(reader: Reader): EIT_Image_Availability_Coordinator.SelectedAction_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorSelectedAction_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorSelectedAction_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorSelectedReason_Payload(o: EIT_Image_Availability_Coordinator.SelectedReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorSelectedReason_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorSelectedReason_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.SelectedReason_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorSelectedReason_Payload(reader: Reader): EIT_Image_Availability_Coordinator.SelectedReason_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorSelectedReason_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorSelectedReason_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(reader: Reader): EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicMode_Payload(o: EIT_Image_Availability_Coordinator.PublicMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPublicMode_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPublicMode_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PublicMode_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicMode_Payload(reader: Reader): EIT_Image_Availability_Coordinator.PublicMode_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorPublicMode_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPublicMode_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorVisibility_Payload(o: EIT_Image_Availability_Coordinator.Visibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorVisibility_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorVisibility_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Visibility_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorVisibility_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Visibility_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorVisibility_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorVisibility_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultSummary(o: EIT_Image_Availability_Coordinator.FaultSummary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultSummary(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultSummary(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultSummary, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultSummary(reader: Reader): EIT_Image_Availability_Coordinator.FaultSummary = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultSummary()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultSummary _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultSummary_Payload(o: EIT_Image_Availability_Coordinator.FaultSummary_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultSummary_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultSummary_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultSummary_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultSummary_Payload(reader: Reader): EIT_Image_Availability_Coordinator.FaultSummary_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultSummary_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultSummary_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryFrame(o: EIT_Image_Availability_Coordinator.RecoveryFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryFrame(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceFrame(o: EIT_Image_Availability_Coordinator.EvidenceFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceFrame(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionFrame(o: EIT_Image_Availability_Coordinator.AdmissionFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionFrame(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactFrame(o: EIT_Image_Availability_Coordinator.ArtifactFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactFrame(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewFrame(o: EIT_Image_Availability_Coordinator.ReviewFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewFrame(reader: Reader): EIT_Image_Availability_Coordinator.ReviewFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewFrame_Payload(o: EIT_Image_Availability_Coordinator.ReviewFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.ReviewFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationFrame(o: EIT_Image_Availability_Coordinator.PresentationFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationFrame(reader: Reader): EIT_Image_Availability_Coordinator.PresentationFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o: EIT_Image_Availability_Coordinator.PresentationFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.PresentationFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDecisionFrame(o: EIT_Image_Availability_Coordinator.DecisionFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDecisionFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDecisionFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DecisionFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDecisionFrame(reader: Reader): EIT_Image_Availability_Coordinator.DecisionFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorDecisionFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDecisionFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.DecisionFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDecisionFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DecisionFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDecisionFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.DecisionFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorDecisionFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDecisionFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityFrame(o: EIT_Image_Availability_Coordinator.AvailabilityFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityFrame(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityFrame(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityFrame, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityFrame(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityFrame = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityFrame()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload _)
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

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS _)
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